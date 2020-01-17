package reflect;

import domain.Person;

import java.lang.reflect.Field;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 16:24
 */
public class reflectTest2 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("domain.Person");
        Field[] fs = clazz.getDeclaredFields();
        for (Field f : fs)
        {
            System.out.println(f);
        }
        Field f = clazz.getDeclaredField("d");
        Person p = new Person();
        f.setAccessible(true);
        f.set(p,2);
        System.out.println(f.get(p));
    }
}
