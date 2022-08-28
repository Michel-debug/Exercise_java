package com.mayikt.day11;

/**
 *
 * @param <T>
 *     泛型方法
 *     格式
 *     public<T>void show(T t){...}
 */
public class Meite {
    public<T> T show(T str){
        return str;
    }

    public static void main(String[] args) {
        Meite meite = new Meite();
        String mayi = meite.show("MAYI");
        Integer show = meite.show(123);
        Double show1 = meite.show(3.22);
        Boolean show2 = meite.show(true);

    }
}
