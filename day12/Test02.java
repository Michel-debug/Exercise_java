package com.mayikt.day12;

import com.mayikt.day11.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class Test02 {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("1");
//        strings.add("2");
        HashMap<String, Student> stringStudentHashMap = new HashMap<>();
        stringStudentHashMap.put("mayikt01",new Student("Michel",22));
        stringStudentHashMap.put("mayikt02",new Student("Michel",23));
        stringStudentHashMap.put("mayikt03",new Student("Michel",24));
        stringStudentHashMap.put("mayikt04",new Student("Michel",25));
        for (String key: stringStudentHashMap.keySet()
             ) {
            Student student = stringStudentHashMap.get(key);
            System.out.println("姓名:"+student.getUsername()+"\t age:"+student.getAge());
        }

    }
}
