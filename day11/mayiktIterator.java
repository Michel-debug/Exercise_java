package com.mayikt.day11;

import java.util.List;

public class mayiktIterator {
    private List list;
    public mayiktIterator(List list){
        this.list = list;
    }
    private int count = 0;
    public Object next(){
        if(list == null ) throw new MayiktException("n'existe pas cette liste");
        if (count >=list.size()) throw new MayiktException("ne pas obtenir le dernier element");
        return list.get(count++);
    }
    public boolean hasNext(){
        return count != list.size();// fois egale size()


    }
}
