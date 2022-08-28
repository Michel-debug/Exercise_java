package com.mayikt.day12;
/*
可变参数 int...a 可变参数 底层封装成数组的形式传递给我们的方法
 */
public class Variable {
    public static int sum(int c,int...a){ //可变参数放到最后即可 当遇到多个参数时
        int sum=0;
        for (int i: a
             ) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum(1,2,3,4,5,6));
    }
}
