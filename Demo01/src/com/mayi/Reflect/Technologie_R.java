package com.mayi.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Michel
 * @create 2022-08-12-17:24
 * @contact 724915929@qq.com
 */
public class Technologie_R {
    //通过反射技术 获取成员属性赋值，反射调用我们方法
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class aClass = Right.class;
        Field[] fields = aClass.getFields(); //获取所有公有字段
        for(int i = 0; i < fields.length ; i++){
            System.out.println(fields[i]);
        }
        Right right = (Right)aClass.newInstance();
        Field Money = aClass.getField("money");
        //反射技术 私有成员属性赋值， 参数1：传递对象， 参数2：赋值的内容
       // 如果通过反射技术给私有成员属性赋值的情况下 设置下访问的权限
      //  Money.setAccessible(true); 赋权限


        Money.set(right,200000);
        System.out.println(right.money);
        // 通过反射技术获取公有方法 getMethods()
        Class bclass = Class.forName("com.mayi.Reflect.Right");
//        Method[] methods = bclass.getMethods();
//        for(int i = 0; i< methods.length;i++){
//            System.out.println(methods[i]);
//        }
        Method[] methods1 = bclass.getDeclaredMethods(); //所有方法 包括公有私有的
        for(int i = 0; i< methods1.length;i++){
            System.out.println(methods1[i]);
        }
        // 通过反射技术调用到我们的私有addUser
        Method addshow_2 = bclass.getDeclaredMethod("show_2",String.class,int.class); //获取该类的方法
        Right object = (Right) bclass.newInstance(); //创建该类对象
        addshow_2.setAccessible(true);  //更改权限
        addshow_2.invoke(object,"hello",12);  //该类方法  给函数赋值参数 一参数 为类对象

    }

}
