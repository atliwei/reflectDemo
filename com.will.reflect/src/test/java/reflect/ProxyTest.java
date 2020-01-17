package reflect;

import domain.Hello;
import domain.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 17:08
 */
public class ProxyTest {
    public static void main(String[] args) {
        Hello person = new Person();
        person.hello();
        InvocationHandler handler = new ProxyDemo(person);
        /**
         * 参数1 获取代理类的类加载器
         * 参数2 获取被代理类的接口
         * 参数3 代理类的对象
         */
        Hello o = (Hello) Proxy.newProxyInstance(handler.getClass().getClassLoader(),person.getClass().getInterfaces(), handler);
        o.hello();

    }
}
