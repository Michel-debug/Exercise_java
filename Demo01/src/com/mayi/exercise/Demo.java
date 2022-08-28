package com.mayi.exercise;


/**
 * @author Michel
 * @create 2022-08-12-10:12
 * @contact 724915929@qq.com
 */
public class Demo {
    public static void main(String[] args) {
        JumperInterface cat = new Cat("小白",20); //接口也可以创建
        cat.jump();
        Animal123 Animal123 = new Cat("小花猫",13);
        Animal123.eat();
        Animal123.jump();
    }
}
