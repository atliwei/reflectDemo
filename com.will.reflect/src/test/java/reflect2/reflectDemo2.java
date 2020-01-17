package reflect2;

import domain2.Person;

import java.lang.reflect.Field;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 9:21
 */
public class reflectDemo2 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz1 = Class.forName("domain2.Person");
        Field[] fs = clazz1.getDeclaredFields();
        for (Field f : fs)
        {
            System.out.println(f.getName());
        }
        Field f = clazz1.getDeclaredField("d");
        Person p = new Person();
        f.setAccessible(true);
        f.set(p,"111");
        System.out.println(f.get(p));
    }
}

