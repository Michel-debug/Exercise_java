package com.mayi.day06;

import java.sql.SQLOutput;

/**
 * @author Michel
 * @create 2022-08-12-10:53
 * @contact 724915929@qq.com
 */
public class Externe {
    private int age;
    public  int code;
    /*
     内部类可以访问 外部类的私有属性
     内部类分类 ：
      1.成员内部类
      2.方法内部类
      3.静态内部类
      4.匿名内部类
      成员内部类（静态内部类，成员内部类）
      局部内部类（方法内部类，匿名内部类）
     */
    public  class Interne{
         public void Print(){
             System.out.println(age);
             System.out.println(code);

         }
    }
    //外部类想要使用内部类 必须先要创建内部类
    public void Exprint(){
        Interne I1 = new Interne();
        I1.Print();
    }
}
