package com.mayi.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Michel
 * @create 2022-08-12-16:32
 * @contact 724915929@qq.com
 */
/*
一个类只有一个Class对象产生
反射机制 核心类
 Java.lang.Class;
 Java.lang.reflect.Constructor;
 Java.lang.reflect.Field;
 Java.lang.reflect.Method;
 Java.lang.reflect.Modifier;

 */
public class Test_reflechir {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
       /* Test_reflechir test_reflechir = new Test_reflechir();
        类名.getClass() == 对象获得的class 读取到内存中的class 只有一个 ，同一个
        System.out.println(test_reflechir.getClass()== Test_reflechir.class);
        Class<?> aclass = Class.forName("com.mayi.Reflect.Test_reflechir");
        System.out.println(aclass==Test_reflechir.class);*/
        Class<?> aClass = Class.forName("com.mayi.Reflect.Right");
        Right right = (Right)aClass.newInstance();
        System.out.println(right);

        // getDeclaredConstructors;获取所有的构造方法 包括私有的
        // 使用反射技术  使用有参构造方法 给成员属性赋值 创建对象
        Constructor<?> constructor = aClass.getConstructor(int.class);
        Right right1 = (Right)constructor.newInstance(22);
        System.out.println(right1);
    }
}

class Right {
    private int age;
    private String name;
    public double money;
    public Right(){
        System.out.println("无参构造方法");
    }
    public Right(String name){
        System.out.println("有参构造方法");
        this.name = name ;
    }
    public Right(int age){
        System.out.println("有参构造方法");
        this.age=age;
    }
    public Right(String name, int age) {
        System.out.println("有参构造方法");
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("hello");
    }
    private void show_2(String name, int age){
        System.out.println(name+","+age);
    }
}