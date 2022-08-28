package com.mayikt.day14;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(12);
        integers.add(14);
        integers.add(30);
        integers.add(3);
        //Collections 只针对单列集合
        Collections.sort(integers);//从小到大
        Collections.reverse(integers);//从大到小
        Collections.shuffle(integers); //对集合中的数据 随机排列
        for (int i: integers) {
            System.out.println(i);
        }
    }

}
