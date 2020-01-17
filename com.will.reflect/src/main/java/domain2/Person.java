package domain2;

import lombok.Data;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 9:10
 */
@Data
public class Person implements Hello{
    private String name;
    private int age;
    public String a;
    protected String b;
    String c;
    private String d;

    public Person(){
        System.out.println("无参构造");
    }

    public Person(String name){
        this.name = name;
        System.out.println(name + ":有参构造");
    }

    private Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(name + ":有参构造");
    }

    public void hello(){
        System.out.println("hello");
    }

    private void hello(String msg){
        System.out.println("hello" + msg);
    }
}
