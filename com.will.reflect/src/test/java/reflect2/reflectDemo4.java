package reflect2;

import domain2.Person;

import java.lang.reflect.Method;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 10:10
 */
public class reflectDemo4 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("domain2.Person");
        Method[] ms = clazz.getDeclaredMethods();
        for(Method m : ms)
        {
            System.out.println(m);
        }

        Method m = clazz.getDeclaredMethod("hello",String.class);
        Person p = new Person();
        m.setAccessible(true);
        m.invoke(p,"world");

    }
}
