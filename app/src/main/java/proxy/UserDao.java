package proxy;

/**
 * Created by wangxf on 2020/9/9.
 */
public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("----已经保存数据！----");
    }
}
