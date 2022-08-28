package com.mayikt.day14;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 *  hashMap key 可以为我们自定义对象
 *  hashmap 存储数据  无序的
 *  hashmap key 可以存放null值， 因此hashset也可以存放null值
 *  存放在数组中null位置
 */
public class HashMap_principe<K,V> {
    public static void main(String[] args) {
        HashMap_principe<String,String> principe = new HashMap_principe<>();
        for (int i = 0 ;i<100;i++){
           principe.put("mayikt"+i,"i"+i);
        }
        System.out.println(principe.get("mayikt1"));

    }
    //创建一个容器存放 如果基于arraylist 查找时间复杂度为o(n) 效率非常低
    //优点就是有序的  不是散列 但是底层是用hashcode（）计算的
    private ArrayList<Entry<K,V>> arrayList= new ArrayList<Entry<K,V>>();
    class Entry<K,V>{
        private K k;
        private V v;

        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }
    public void put(K k, V v){
        arrayList.add(new Entry<>(k,v));
    }
    public V get(K k){
        for (Entry<K,V> entry:arrayList) {
            if (entry.k.equals(k)) return entry.v;

        }
        return null;
    }
}
