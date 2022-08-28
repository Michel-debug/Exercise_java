package com.mayi.day07;

/**
 * @author Michel
 * @create 2022-08-12-11:21
 * @contact 724915929@qq.com
 */
/*
  java 在编译阶段，发现匿名内部类，在底层会创建一个没有名称的mayikt接口   test$01.class

  匿名内部类底层 new 接口 底层还是帮你创建了实现类 名称是null
  同理 如果是抽象类 ，底层还是帮你创建了一个子类，名称是null 继承该方法
  本质：是一个继承了该类（子类）或者实现了该接口的（实现类）匿名对象
 */
public class Test07 {
    public static void main(String[] args) {
        Mayikt1 mayikt1 = new Mayikt1(){
            public void  show(){
                System.out.println("mayikt");
            }
        };
        mayikt1.show();
    }
}
