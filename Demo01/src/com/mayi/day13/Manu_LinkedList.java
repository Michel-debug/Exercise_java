package com.mayi.day13;

/**
 * @author Michel
 * @create 2022-08-25-11:23
 * @contact 724915929@qq.com
 */
public class Manu_LinkedList<E>{
     private Node<E> head;
     private Node<E> tail;
     private  int size;
     private static class Node<E>{
         private E item; //当前节点的值
         private Node<E> next;  //下一个节点
         private Node<E> prev;  //上一个节点


         public Node(Node<E> prev,Node<E> next, E item){
         this.item = item;
         this.prev = prev;
         this.next = next;
                }
         }
    public  void add(E e) {
        Node l = tail;
        Node<E> newNode = new Node<>(l, null, e);
        tail = newNode;
        if (l == null) {
            head = tail = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }
    public Node<E> get(int index){
         if(index < size >> 1){
             Node<E> node = head;
             for (int i=0;i<index;i++){
                 node=node.next;
             }
             return node;
         }else {
             Node<E> node = tail;
             for (int i = size - 1; i > index; i--) {
                 node = node.prev;
             }
             return node;
         }
    }
    public E remove(Node<E> node){
         Node<E> prev = node.prev;
         Node<E> next = node.next;
         final E element = node.item;
         if(next == null && prev == null){
             node = null;
             return  element;
         }else if (next == null){
             prev.next=null;
             tail = prev;
             return  element;
         }else if(prev == null){
             next.prev=null;
             head = next;
             return  element;
         }
         prev.next=next;
         next.prev=prev;
         size--;
         return element;

    }
    public static void main(String[] args) {
      Manu_LinkedList<String> stringManu_linkedList = new Manu_LinkedList<String>();
        stringManu_linkedList.add("Michel");
        stringManu_linkedList.add("MICHEL2");
        stringManu_linkedList.remove(stringManu_linkedList.get(0));
        System.out.println(stringManu_linkedList.get(0).item);
     }

}
