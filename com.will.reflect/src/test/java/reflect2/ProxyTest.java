package reflect2;

import domain2.Hello;
import domain2.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 11:29
 */
public class ProxyTest {
    public static void main(String[] args) {
        Hello p = new Person();
        p.hello();
        InvocationHandler handler = new ProxyDemo(p);
        Hello o = (Hello) Proxy.newProxyInstance(handler.getClass().getClassLoader(), p.getClass().getInterfaces(), handler);
        o.hello();

    }
}
