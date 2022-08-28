package com.mayi.day03;

/**
 * @author Michel
 * @create 2022-08-09-16:17
 * @contact 724915929@qq.com
 */
public class Student  {

    static int age=3;
    /*
    1.方法重写注意事项
    1.1 父类中的私有方法 子类是无法重写的
    子类方法的权限要大于父类方法的权限
     */
    public static void a1() {
        System.out.println("bonjour");
    }


    public static void main(String[] args) {
        Student s1 = new Student();
        a1();
    }
}