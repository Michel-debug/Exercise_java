package com.mayikt.day12;

public class MayiktArrayList<E> implements MayiktList<E>{
    @Override
    public void add(E e) {

        System.out.println("reussir a ajouter");
    }

    @Override
    public void get(int index) {
        System.out.println("reussir a renseinger");
    }
}
