package com.mayi.day09;

/**
 * @author Michel
 * @create 2022-08-15-8:23
 * @contact 724915929@qq.com
 */
public class Utils {
    //构造方法 使用private关键字修饰
    // public static 关键字修饰工具类中方法 可以直接通过类名称方法
   //包装类用的是引用传递，基本数据类型 值传递
    /*
    Integer属于对象 存放在堆空间
    基本数据类型 存放在栈空间中 局部变量
    Integer属于包装类 默认是null(包装类) int基本数据类型 默认值为0
    输出integer 底层 会走integer 包装类中toString 方法 属性对应的基本数据类型
    
    包装类 引用传递 基本数据类型 值传递
    实际开发中定义包装类 比较多
     */
    public static void main(String[] args) {
        Integer integer = new Integer(39);
        System.out.println(integer);
        int a = 66;
        System.out.println(Integer.toString(66).getClass());
        String a1 = ""+a;
        System.out.println(a1.getClass());
        System.out.println(String.valueOf(a).getClass());
        System.out.println(Integer.valueOf(a1).getClass());
        Integer integer1 = 98;
        System.out.println(integer1); // 重写了类中的 toString方法
    }
}
