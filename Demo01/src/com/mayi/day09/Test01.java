package com.mayi.day09;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Michel
 * @create 2022-08-14-21:37
 * @contact 724915929@qq.com
 */
public class Test01 {
    public static void main(String[] args) {
        //ctrl+alt+v 自动生成对象
        /*
        Jdk1.8 将方法区/永久代该名称 元空间
        JDK1.7 将字符串常量池 从方法区 改为堆中存放
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入字符串");
//        String str = scanner.nextLine();
//        System.out.println("第一个字符为："+str.charAt(0));
//        Long start = System.currentTimeMillis();
//        for(int i = 0;i< 1000000;i++){
//            System.out.println("hello");
//        }
//        Long end = System.currentTimeMillis();
//        System.out.println("花费"+(end-start)+"ms");
        int[]arr={10,5,6,31,32,4};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
