package com.mayi.day14;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Michel
 * @create 2022-08-27-20:32
 * @contact 724915929@qq.com
 */
public class Array_def {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> hashMaps = new ArrayList<>();
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("michel","en france");
        HashMap<String, String> stringStringHashMap2 = new HashMap<>();
        stringStringHashMap2.put("michel2","en france2");
        HashMap<String, String> stringStringHashMap3 = new HashMap<>();
        stringStringHashMap3.put("michel3","en france3");
        hashMaps.add(stringStringHashMap);
        hashMaps.add(stringStringHashMap2);
        hashMaps.add(stringStringHashMap3);
        for (HashMap<String,String> hashs: hashMaps) {
            System.out.println(hashs);
        }
    }
}
