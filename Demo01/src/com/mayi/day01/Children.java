package com.mayi.day01;

/**
 * @author Michel
 * @create 2022-08-08-16:59
 * @contact 724915929@qq.com
 */
public class Children extends Parent {
    public Children() {
        super(20);
        System.out.println("儿童构造方法");
    }

    public Children(int age) {
        super(age);
    }
    protected void call(){
        System.out.println("children");
    }
}
