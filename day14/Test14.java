package com.mayikt.day14;

/**
 *  1.7  hashmap集合 基于数组和链表实现
 *  hashmap集合1.8版本 基于数组 链表和红黑树 实现的
 * @param <K>
 * @param <V>
 */
public class Test14<K,V>{
    private Entry[]entrys = new Entry[10000]; //假设数组的容量=10000扩容机制
    class Entry<K,V>{
        private K k;
        private V v;
        int hash;
        private Entry<K,V> next;
        public Entry(K k, V v,int hash) {
            this.k = k;
            this.v = v;
            this.hash=hash;
        }
    }
    public void put(K k,V v){
        int index = k.hashCode()%entrys.length;//哈希函数 获取一个算法下标 存入数组中
        entrys[index] = new Entry<>(k,v,k.hashCode());
    }
    public void put2(K k, V v){  //解决hash冲突问题 相同hashcode值 用链表连接
        int hash = k.hashCode();
        int index = k.hashCode()%entrys.length;
       Entry<K,V> entry = entrys[index];
        if (entrys[index] == null){
            entrys[index] = new Entry(k,v,hash);
        }else{
            while(entry.next!=null){
                entry=entry.next;
                System.out.println(entry==entrys[index].next);
            }
            entry.next=new Entry<>(k,v,hash);

        }
    }
    public V get(K k){
        int index = k.hashCode()% entrys.length;
        return (V) entrys[index].v;
    }
    public V get2(K k){
        int index = k.hashCode()%entrys.length;
        while(entrys[index]!=null) {
            if (k.hashCode()==entrys[index].hash&&k == entrys[index].k) return (V) entrys[index].v;
            else entrys[index]=entrys[index].next;
        }
        return null;
    }
    public static void main(String[] args) {
        Test14<Object, String> stringStringTest14 = new Test14<>();
        stringStringTest14.put2("a","a");
        stringStringTest14.put2(97,"b");

        System.out.println(stringStringTest14.get2(97));
    }
}
