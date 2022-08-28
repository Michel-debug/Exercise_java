package com.mayikt.day12;

import com.mayikt.day11.Student;

import java.util.HashSet;
import java.util.Iterator;

/*
HashSet 底层基于hashmap实现的 因此存储顺序是无序的  通过哈希函数 存储
且元素不能重复  底层就是map 的key值 key值又是唯一的  故是不能重复的
运行存放key值为null

HashSet集合没有get方法 因为底层map中的key是无序的  没有指定下标 所以无法访问
底层判断内存地址是否相同 调用equals方法
equals 如果没有重新方法 就是在比较两个对象的内存地址
需要重新元素对应的equals方法和hashcode方法 比较两个对象成员的属性是否相同

 */
public class HashSET {
    public static void main(String[] args) {
        HashSet<Student> strings = new HashSet<>();
//        strings.add("123");
//        strings.add("Michel");
//        strings.add("hio");
//        strings.add("micl");
//        strings.add("1");
//        strings.add("2");
//        strings.add("3");
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        Student xiaoming = new Student("Michel",18);
        Student xiaohong = new Student("Michel",18);
        //修改student中的 equals方法
        strings.add(new Student("Michel",18));
        strings.add(new Student("Michel",18));
        strings.add(new Student("Michel",18));
        System.out.println(strings.size());
        System.out.println(xiaohong.hashCode());
        System.out.println(xiaoming.hashCode());

    }
}
