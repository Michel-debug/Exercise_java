package com.mayikt.day14;

/**
 *
 *  HashMap 键值 key 是否可以存放自定义的对象呢
 *  可以的
 *  如果我们的hashmap key存放我们自定义的对象 注意key 自定义的对象 需要重写equals hashcode
 *
 *
 */

import java.util.HashMap;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {
        HashMap<Etudiant, String> etudiantStringHashMap = new HashMap<Etudiant, String>();
        /**
         *  key : 存放学生对象
         *  value：学生对应的手机号码
         */
        etudiantStringHashMap.put(new Etudiant("michel",23),"18867740611");
        etudiantStringHashMap.put(new Etudiant("michel",23),"188677406111");

        /**
         * hashmap 存放两条key  学生对象 成员属性值都是一样
         * hashmap key不允许重复，如果发生了相同的key，则认为是在value值修改
         * new 学生对象 底层hashmap集合如何防止key重复 调用该key的eauqls方法  但是我们没有重写equals方法
         * equals 默认情况是比较内存地址
         */
        for (Etudiant etu : etudiantStringHashMap.keySet()){
            String phone = etudiantStringHashMap.get(etu);
            System.out.println(phone);
        }
        for (Map.Entry<Etudiant,String> map :etudiantStringHashMap.entrySet()){
            System.out.println(map.getKey()+" key:"+map.getValue());
        }

    }

}
