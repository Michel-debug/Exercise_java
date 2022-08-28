package com.mayi.day09;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/**
 * @author Michel
 * @create 2022-08-21-20:05
 * @contact 724915929@qq.com
 */
public class Test17 {
    public static void main(String[] args) {
        Integer a = 19; //将我们的基本数据类型 直接赋值给包装类型  装箱
        int z=a; //将我们的包装类型赋值给基本数据类型 拆箱
        // Integer 类中的方法 intvalue值 在赋值给int
        Integer j=0;
        j+=1;
        /*
         j=j+1 Integer.intvalue()+1; 拆箱
         在装箱 Integer.valueof(j) 装箱
         */
        String str = "97,16,36,18,50";
        String[] array_str = str.split(",");
        Arrays.sort(array_str);
        String str2 = StringUtils.join(Arrays.asList(array_str),",");
        System.out.println(str2);
    }
}
