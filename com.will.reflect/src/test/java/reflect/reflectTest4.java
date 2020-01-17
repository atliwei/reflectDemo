package reflect;

import domain.Person;

import java.lang.reflect.Method;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 16:40
 */
public class reflectTest4 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("domain.Person");
        Method[] ms = clazz.getDeclaredMethods();
        for (Method m : ms)
        {
            System.out.println(m);
        }
        System.out.println("===============================");
        Method m = clazz.getDeclaredMethod("hello",String.class);
        m.setAccessible(true);
        Person p = (Person) clazz.newInstance();
        m.invoke(p,"world");
    }
}
