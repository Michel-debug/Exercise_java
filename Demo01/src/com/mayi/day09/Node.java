package com.mayi.day09;

/**
 * @author Michel
 * @create 2022-08-25-10:18
 * @contact 724915929@qq.com
 */
class Node<E> {
    /**
     *  node 节点元素的值
     */
     private E e;
     Node<E> next; //下一个节点

    public static void main(String[] args) {
        Node<String> stringNode = new Node<>();
        stringNode.e = "a";
        Node<String> stringNode1 = new Node<>();
        stringNode1.e = "b";
        Node<String> stringNode2 = new Node<>();
        stringNode2.e = "c";
        stringNode.next = stringNode1;
        stringNode1.next = stringNode2;
        System.out.println(stringNode);
        showNode(stringNode);
    }
    public static void showNode(Node<?> node){
        Node<?> cuNode = node; //当前节点 是从头节点开始
        while(cuNode!=null){
            System.out.println(cuNode.e);
            cuNode=cuNode.next;
        }

    }
}
