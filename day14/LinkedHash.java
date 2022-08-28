package com.mayikt.day14;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Random;

/**
 * Linkedhashmap et Hashmap  difference?
 *
 * la seule difference est que Linkedhashmap stocke les elements par ordre
 *
 * Hashmap est un ensemble desordonne
 *
 *
 *LinkedHashSet 存放的元素是有序的  不重复  底层基于linedhashmap 集合实现的
 * HashSet 集合存放的元素是散列的
 */
public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<String, String> stringStringLinkedHashMap = new LinkedHashMap<>();
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("String2");
        strings.add("String1");
        strings.add("String3");
        strings.add("String4");
        for (String str : strings){
            System.out.println(str);
        }
        HashSet<Integer> integers = new HashSet<>();
        Random random = new Random();
        while(integers.size()<10){
            int number = random.nextInt(20)+1;
            integers.add(number);
        }
        for(int i : integers){
            System.out.println(i);
        }
    }
}
