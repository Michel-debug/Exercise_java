package com.mayi.exercise;

/**
 * @author Michel
 * @create 2022-08-12-10:00
 * @contact 724915929@qq.com
 */
public abstract class Animal123 implements JumperInterface {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
    public Animal123(){}
    public Animal123(String name,int age) {
        this.name = name;
        this.age = age;
    }

    abstract void eat();
}
