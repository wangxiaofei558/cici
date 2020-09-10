package design;

/**
 * Created by wangxf on 2020/8/26.
 */
public class Singleton {

//    /**
//     * 懒汉式（静态常量）
//     */
//    private final static Singleton INSTANCE = new Singleton();
//    private Singleton(){
//
//    }
//    public static Singleton getInstance() {
//        return INSTANCE;
//    }
//
//    /**
//     * 饿汉式（静态代码块）
//     */
//    private static Singleton instance;
//
//    static {
//        instance = new Singleton();
//    }
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        return instance;
//    }
//
//    /**
//     * 懒汉式（线程不安全）
//     */
//    private static Singleton singleton;
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
//
//    /**
//     * 懒汉式（线程安全，同步方法）
//     */
//    private static Singleton singleton;
//
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
//
//    /**
//     * 懒汉式（线程安全，同步代码块）
//     */
//    private static Singleton singleton;
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                singleton = new Singleton();
//            }
//        }
//        return singleton;
//    }
//
//    /**
//     * 双重检查
//     */
//    private static volatile Singleton singleton;
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }
//
//    /**
//     * 静态内部类
//     */
//    private Singleton() {}
//
//    private static class SingletonInstance {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//
//    public static Singleton getInstance() {
//        return SingletonInstance.INSTANCE;
//    }
//
//    /**
//     * 枚举类
//     */
//    public enum Singleton {
//        INSTANCE;
//        public void whateverMethod() {
//
//        }
//    }

}
