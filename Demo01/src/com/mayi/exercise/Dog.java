package com.mayi.exercise;

import java.util.Date;

/**
 * @author Michel
 * @create 2022-08-12-9:59
 * @contact 724915929@qq.com
 * ctrl + alt +u 生成类图
 *
 *  接口可以进行多继承，一个类可以多实现接口，类只能单继承
 */
public class Dog extends Animal123 {
    public Dog(String name,int age){
        super(name,age);
    }
    @Override
    public void jump() {
        System.out.println("狗跳墙");
    }

    @Override
    void eat() {
        System.out.println("狗吃骨头");
    }
}
