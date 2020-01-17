package domain;

import lombok.Data;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 16:19
 */
@Data
public class Person implements Hello{
    private String name;
    private int age;
    public int a;
    protected int b;
    int c;
    private int d;

    public Person(){

    }

    public Person(String name){

        this.name = name;
        System.out.println(name + "是有参共有构造");
    }

    private Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(name + "是私有构造" + age);
    }

    public void hello() {
        System.out.println("hello");
    }

    private void hello(String msg){
        System.out.println("hello" + msg);
    }
}
