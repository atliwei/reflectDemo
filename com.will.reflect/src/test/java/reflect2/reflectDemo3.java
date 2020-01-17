package reflect2;

import java.lang.reflect.Constructor;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 9:52
 */
public class reflectDemo3 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("domain2.Person");
        Constructor<?>[] cs = clazz.getDeclaredConstructors();
        for (Constructor<?> c : cs)
        {
            System.out.println(c);
        }
        System.out.println("=============================");

        Constructor<?> c = clazz.getDeclaredConstructor(String.class,int.class);
        c.setAccessible(true);
        c.newInstance("liwei",22);

    }
}
