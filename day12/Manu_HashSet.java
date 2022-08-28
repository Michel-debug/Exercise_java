package com.mayikt.day12;

import java.util.HashMap;

public class Manu_HashSet<E> {
    private HashMap<E,Object> map;
    private static final Object PRESENT = new Object();
    public Manu_HashSet(){
        map = new HashMap<>();
    }
    public void add(E e){
        map.put(e,PRESENT);
    }

    @Override
    public String toString() {
        return "Manu_HashSet{" +
                "map=" + map +
                '}';
    }

    public static void main(String[] args) {
        Manu_HashSet<String> objectManu_hashSet = new Manu_HashSet<>();
        objectManu_hashSet.add("Michel");
        objectManu_hashSet.add("MICHEL2");
        objectManu_hashSet.add("michel3");
        System.out.println(objectManu_hashSet);
    }
}
