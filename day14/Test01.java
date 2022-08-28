package com.mayikt.day14;

public class Test01 {
    /**
     * javase基础知识：
     * equals属于object父类， 默认的情况下 在比较两个对象的内存地址
    hashcode 属于object父类中，Java虚拟机提供给每个对象一个hashcode值 整数类型 int 类型
     如果equals方法比较两个对象相等，则hashcode值也一定相等
     但是两个对象的hashcode值相等不代表使用equals比较也相等

     MD5算法 加密底层算法 hashcode算法
     */
    public static void main(String[] args) {
        String str ="A";
        Integer inta = 65; //hashcode equivale soi meme
        System.out.println("str:"+str.hashCode());
        System.out.println("inta:"+inta.hashCode());
    }
}
