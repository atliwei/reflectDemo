package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 17:05
 */
public class ProxyDemo implements InvocationHandler {

    Object object;
    public ProxyDemo(Object object){

        this.object = object;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "方法开始执行");
        Object result = method.invoke(object, args);
        System.out.println(method.getName() + "方法执行完毕");
        return result;
    }
}
