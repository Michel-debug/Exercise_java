package com.mayikt.day11;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Michel");
        //在集合中使用泛型 必须使用引用类型，如果使用基本数据类型 则使用他们的包装类
        strings.add("theo");
        strings.add("heihei");
        /*
        在Arraylist集合基于数组形式实现的
         */
        //使用size方法获得集合中的元素 get获取集合中的元素
        for (int i = 0; i< strings.size();i++){
            System.out.println(strings.get(i));
        }
        //System.out.println(strings.get(5));
        System.out.println("strings[1]:"+strings.get(1));
        String str = strings.set(1,"chenJunjie"); //返回原来的值
        System.out.println("str:"+str);
        System.out.println("strings[1]:"+strings.get(1));
        //删除原来的数据 ，后面的数据往前面移动
        strings.remove(1);
        System.out.println("strings[1]:"+strings.get(1));
    }
}
