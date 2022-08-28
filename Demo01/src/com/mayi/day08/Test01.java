package com.mayi.day08;

import java.util.Random;

/**
 * @author Michel
 * @create 2022-08-13-21:38
 * @contact 724915929@qq.com
 */
public class Test01 {
    public static void main(String[] args) {
        /*
        在 Object父类中equals 比较两个对象的内存地址是否相同
        如果自定义对象 没有重新object中的equals 方法则比较的是内存地址是否相同
        如果我们类没有继承其他类的情况下，则当前该类默认间接的形式继承了object作为父类
        Object类的方法：
        clone()克隆方法 （复制对象）
        equals(Object obj) 比较两个对象是否相等
        finalise() -- jvm的垃圾回收机制
        getClass() -- 获取该对象的class
        hashCode() -- HashMap集合
        notify(),notifyAll(),wait(),waitZWSP(long timeoutMillis)
        toString() 返回对象的字符串表示形式
        sychronized 多线程之间的通信
         */
     //   Random random = new Random();
      //  System.out.println(random.nextInt(101)); //api 就是 Java 的封装类
        String str1 = "mayikt1";
        String str2="mayikt1";
        String str3 = new String("mayikt1");
        System.out.println(str1.equals(str3)); //equals 比较内容
        //equals比较时 前面如果是null.equals(比较) 报错  如果null 放后面则不会报错
        System.out.println(str1==str3); // == 比较地址


    }
}
