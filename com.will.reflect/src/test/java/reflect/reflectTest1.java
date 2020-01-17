package reflect;

import domain2.Person;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 16:20
 */
public class reflectTest1 {
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("domain.Person");
        System.out.println(clazz);

        Class clazz2 = Person.class;
        System.out.println(clazz2);

        Person p = new Person();
        Class clazz3 = p.getClass();
        System.out.println(clazz3);
    }
}
