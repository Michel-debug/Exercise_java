package com.mayikt.day11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test02 {
    /*
    1.迭代器 --属于 集合中专用
    在collection接口中 没有get方法 Collection接口只是提供 集合基本的方法
    具体实现 list arraylist 需要重写实现list接口
    java多态机制 编译看左边
    @param args
    List集合特有方法
    boolean add(int index, E e)   在此集合中的指定位置插入指定的元素
    E remove(int index)    删除指定的索引引出的元素，返回被删除的元素  与collection中的remove 不同
    E set(int index, E element) 修改指定索引处的元素，返回被修改元素
    E get(int index)    返回指定索引处的元素
    List接口下都是有序的接口 根据存放顺序 可以允许存放重复 set接口不允许存放重复数据 无序的
     */
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        List list = (List) collection;
        collection.add("mayikt");
        collection.add("mayikt02");
        collection.add("mayikt03");
        System.out.println(list.get(0));
        Iterator<String> iterator = collection.iterator();
        System.out.println(iterator.next());//enlever le premier element
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        //System.out.println(iterator.next());//extraire le quatrieme element,mais il n'existe pas.
        List<String> list2 = new ArrayList<>();
        list2.add("123123");
        list2.add("12313");
        list2.add("22");
        list2.add("Michel");
        mayiktIterator mayiktIterator = new mayiktIterator(list2);
        while(mayiktIterator.hasNext()) {
            System.out.println(mayiktIterator.next());
        }
  //      mayiktIterator.next();

    }
}
