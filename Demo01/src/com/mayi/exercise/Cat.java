package com.mayi.exercise;

/**
 * @author Michel
 * @create 2022-08-12-9:59
 * @contact 724915929@qq.com
 */
public class Cat extends Animal123 {
    public Cat(String name,int age){
        super(name,age);
    }
    @Override

    public void jump() {
        System.out.println("猫跳墙");
    }

    @Override
    void eat() {
        System.out.println("猫吃饭");
    }
}
