package com.mayi.day01;

/**
 * @author Michel
 * @create 2022-08-08-15:32
 * @contact 724915929@qq.com
 */
public class Student {
    private  String name;
    private int age;

    public Student() {
        this("小米",9);
        //必须放在 第一行
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
