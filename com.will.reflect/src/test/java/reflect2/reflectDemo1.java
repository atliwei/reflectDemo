package reflect2;

import domain2.Person;

/**
 * 获取Class类的三种方式
 * @author Will_Lee
 * @date 2019/12/30 - 9:16
 */
public class reflectDemo1 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz1 = Class.forName("domain2.Person");
        System.out.println(clazz1.getName());

        Class<?> clazz2 = Person.class;
        System.out.println(clazz2.getName());

        Person person = new Person();
        Class<?> clazz3 = person.getClass();
        System.out.println(clazz3);
    }
}

