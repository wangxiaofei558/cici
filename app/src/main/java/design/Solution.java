package design;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution {

//    public static class MyThread extends  Thread{
//        public void run() {
//            System.out.println("my thread run");
//        }
//    }

    public static void main(String[] arg) throws Exception {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        while (true) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " is running...");
                    try {
                        Thread.sleep(3000);

                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            });
        }
    }
}

