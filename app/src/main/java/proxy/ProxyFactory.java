package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wangxf on 2020/9/9.
 */
public class ProxyFactory {

    // 构造器注入原始类
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务2");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("提交事务2");
                        return returnValue;
                    }
                });
    }

}
