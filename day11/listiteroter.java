package com.mayikt.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listiteroter {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("mamyikt01");
        strings.add("mamyikt02");
        strings.add("mamyikt03");
        strings.add("mamyikt04");
        for (String i: strings
             ) {
            System.out.println(i);
        }
        System.out.println("______________");
        /*
        list集合中独有的listiterator 迭代器 从头到尾  或者从尾到头遍历
         */
        ListIterator<String> SlistIterator = strings.listIterator();
        System.out.println(SlistIterator.next());//底层有计数器 count = 3 count++
        while(SlistIterator.hasPrevious()){
            System.out.println(SlistIterator.previous());// 底层计数器 减少  count--
        }
    }
}
