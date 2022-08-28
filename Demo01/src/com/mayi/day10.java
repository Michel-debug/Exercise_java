package com.mayi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * @author Michel
 * @create 2022-08-22-10:56
 * @contact 724915929@qq.com
 */
public class day10 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add("123");
        Collection collection = new ArrayList<String>();
        collection.add("123");//向容器存入数据
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        /*
        集合框架
        1.Collection
        List接口 存放数据可重复
        Arraylist 底层基于数组数据结构实现
        Linkedlist 底层基于链表数据结构实现
        Set接口 不允许存入重复数据 不可重复
        HashSet 不允许存入重复数据，底层基于map集合实现
        Set 集合对数据去重

        Map (存入队列数据 key value)
        HashMap 底层 1.7基于数组+链表实现
                     1.8 基于数组+链表+红黑树 实现
                    线程安全
        HashTable
         */

    }
}
