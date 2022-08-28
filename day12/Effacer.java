package com.mayikt.day12;

import java.util.ArrayList;
import java.util.List;

public class Effacer {
    public static void main(String[] args) {
        /*
        泛型原理 底层 使用擦除机制
        泛型是在编译阶段限制传递的类型
         */
        List<String> strings = new ArrayList<String>();
        strings.add("str");
        //将一个List集合泛型赋值给一个没有使用到泛型List集合 直接去除泛型--擦除机制
        /*
        泛型 是在编译阶段限制传递的类型 在运行阶段都是擦除底层class
        文件在运行 里面是没有泛型的
        java源代码 编译成 class
        xjad工具
        将我们的.class文件反编译成.java文件
         */
        List list = strings;
        list.add(123);
    }
}
