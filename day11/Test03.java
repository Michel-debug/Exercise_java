package com.mayikt.day11;

public class Test03 {
    public static void main(String[] args) {
        Studiant<String> objectStudiant = new Studiant<>();
        objectStudiant.setStu_name("michel");
        Studiant<Integer> integerStudiant = new Studiant<>();
        integerStudiant.setStu_name(123);
        System.out.println(integerStudiant.getStu_name());
        Integer integer = integerStudiant.show2(123, 254);//前面用的是泛型接口，后面用的是泛型方法，泛型方法可以自动识别，泛型接口需要在声明实体类时声明
        System.out.println(integer);
    }
}
