package com.mayikt.day12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap_def {
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1,"Michel1");
        integerStringHashMap.put(2,"Michel2");
        integerStringHashMap.put(3,"Michel3");
        integerStringHashMap.put(3,"Michel4"); //重复 直接 覆盖原来的值
  //      integerStringHashMap.remove(3);
    //    integerStringHashMap.clear();//clear all the key-value
        System.out.println(integerStringHashMap);
        System.out.println();
        if(integerStringHashMap.containsKey(2)){
            System.out.println("oui");
        }else{
            System.out.println("non");
        }
        if (integerStringHashMap.containsValue("Michel")){
            System.out.println("oui michel");
        }else{
            System.out.println("non michel");
        }
        integerStringHashMap.isEmpty();//juger si size egale 0
        Set<Integer> integers = integerStringHashMap.keySet();
        for (Integer str : integers
             ) {
            System.out.println(str);
        }
        Collection<String> values = integerStringHashMap.values();
        for (String str:values
             ) {
            System.out.println(str);
        }
        Set<Map.Entry<Integer, String>> entries = integerStringHashMap.entrySet();
        //HashMap集合底层键值对如何封装 就是通过map接口中的entry对象
        for (Map.Entry<Integer, String> entry: entries
             ) {
            System.out.println("key:"+entry.getKey()+"\tvalue:"+entry.getValue());
        }
        //getOrDefault 如果存在相应的key则返回其对应的value，否则返回给定的默认值defaultvalue
        String mayikt01 = integerStringHashMap.getOrDefault("jesuiston","pere");
        System.out.println(mayikt01);
    }
}
