package com.mayikt.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 类型通配符<?> 一般用于接受使用
 * List<?>:表示元素类型未知的list，他的元素可以匹配任何类型
 * 带通配符的list仅表示他是各种泛型list的父类，并不能把元素添加到其中
 * 类型通配符上限 List<? extends mayikt> 他表示的类型是mayikt 或者其子类
 * 类型通配符下限 List<? super mayikt> 他表示的类型是mayikt 或者其父类
 *
 *
 */
public class Test01 {
    public static void main(String[] args) {
        MayiktArrayList<String> stringMayiktArrayList = new MayiktArrayList<>();
        //stringMayiktArrayList.add("123");
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i =0 ; i<5;i++){
            integers.add(i);
        }
        printList(integers);
    }
    /*
    定义的printList方法 明确知道 接受具体list泛型 是什么类型
    List<?> 只能够用于接受 ？----可以接受所有的泛型类型 不能够用于添加
    可以用get方法获取 ，得到的类型为object类型
     */
    public static void printList(List<?> stringList){ //常见于源码中  不用于添加
          // stringList.add();   ne peut pas ajouter, car le type de list est inconnu
        Object o = stringList.get(4);
        System.out.println(o);
        Iterator<?> iterator = stringList.iterator();
      //  System.out.println("123");
        while(iterator.hasNext()){
          //  System.out.println(456);
            System.out.println(iterator.next());
        }
    }

}
