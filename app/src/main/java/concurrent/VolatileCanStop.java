package concurrent;

import static java.lang.Thread.sleep;

/**
 * Created by wangxf on 2020/8/25.
 */
public class VolatileCanStop implements Runnable {

    private volatile boolean canceled = false;

    @Override
    public void run() {
        int num = 0;
        try {
            while (!canceled && num <= 100000) {
                if (num % 10 == 0) {
                    System.out.println(num + "是10的倍数");
                }
                num++;
                sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileCanStop r = new VolatileCanStop();
        Thread thread = new Thread(r);
        thread.start();
        sleep(3000);
        r.canceled = true;
    }
}
