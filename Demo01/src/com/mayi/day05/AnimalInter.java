package com.mayi.day05;

/**
 * @author Michel
 * @create 2022-08-12-8:02
 * @contact 724915929@qq.com
 */
/*
接口中的方法和成员变量 ，方法默认是public abstract
成员变量默认是常量
 code变量为 static final,直接通过Animal.属性名访问。
 接口中可以定义非抽象方法 defaut 关键字
 接口无法由构造方法
 */
public interface AnimalInter {
   int code=404;
    void show2();
    public default void show(){ //非抽象方法 需要加入defaut
        System.out.println("123");
    }

}
