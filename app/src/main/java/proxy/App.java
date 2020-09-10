package proxy;

/**
 * Created by wangxf on 2020/9/9.
 */
public class App {

    public static void main(String[] args) {
//        UserDao target = new UserDao();
//
//        UserDaoProxy proxy = new UserDaoProxy(target);
//        proxy.save();

//        // 目标对象
//        IUserDao target = new UserDao();
//        // 【原始的类型 class cn.itcast.b_dynamic.UserDao】
//        System.out.println(target.getClass());
//
//        // 给目标对象，创建代理对象
//        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
//        // class $Proxy0   内存中动态生成的代理对象
//        System.out.println(proxy.getClass());
//
//        // 执行方法   【代理对象】
//        proxy.save();

        //目标对象
        UserDaoII target = new UserDaoII();

        //代理对象
        UserDaoII proxy = (UserDaoII) new ProxyFactoryII(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }

}
