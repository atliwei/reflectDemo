package reflect;

import domain.Person;

import java.lang.reflect.Constructor;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 16:32
 */
public class reflectTest3 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("domain.Person");
        Constructor<?>[] cs = clazz.getDeclaredConstructors();
        for (Constructor<?> c : cs)
        {
            System.out.println(c);
        }
        Constructor<?> c = clazz.getDeclaredConstructor(String.class, int.class);
        c.setAccessible(true);
        Person o = (Person) c.newInstance("will",2);


    }
}
