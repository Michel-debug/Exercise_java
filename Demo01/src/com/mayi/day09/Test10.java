package com.mayi.day09;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Michel
 * @create 2022-08-25-10:34
 * @contact 724915929@qq.com
 */
public class Test10 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("mayikt"); //增删查询效率高 基于双向链表实现的
        list.get(0);
        list.add("mayikt2");
        list.add("mayikt3");
        list.add("mayikt4");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
