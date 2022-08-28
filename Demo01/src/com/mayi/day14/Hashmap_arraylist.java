package com.mayi.day14;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Michel
 * @create 2022-08-27-20:52
 * @contact 724915929@qq.com
 */
public class Hashmap_arraylist {
    public static void main(String[] args) {
//        HashMap<String, ArrayList<String>> stringArrayListHashMap = new HashMap<>();
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("杭州市");
//        strings.add("温州市");
//        stringArrayListHashMap.put("浙江省",strings);
//        System.out.println(stringArrayListHashMap);
       Scanner scanner = new Scanner(System.in);
       String str = scanner.nextLine();
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        String[] str_array = str.split("");
       OUT: for (String s1:str_array){
            int count = 1;
            for (String s2:stringIntegerHashMap.keySet()) {
                if(s1.equals(s2)){
                    int value = stringIntegerHashMap.get(s1);
                    value++;
                    stringIntegerHashMap.put(s1,value);
                    continue OUT;
                }

            }
            stringIntegerHashMap.put(s1,count);
        }
        for (String s3:stringIntegerHashMap.keySet()) {
            System.out.println("key:"+s3+"\tvalue:"+stringIntegerHashMap.get(s3));
        }
    }
}
