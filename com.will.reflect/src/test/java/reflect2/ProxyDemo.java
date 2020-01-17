package reflect2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * @author Will_Lee
 * @date 2019/12/30 - 11:24
 */
public class ProxyDemo implements InvocationHandler {
    Object object;

    public ProxyDemo(Object object){
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "开始执行");
        Object o = method.invoke(this.object, args);//执行代理对象指定的方法
        System.out.println(method.getName() + "执行结束");
        return o;

    }
}
