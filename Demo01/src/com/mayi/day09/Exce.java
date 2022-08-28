package com.mayi.day09;

/**
 * @author Michel
 * @create 2022-08-21-20:52
 * @contact 724915929@qq.com
 */
/*
public String getMessage 返回此throwable的详细消息字符串
public String toString 返回此可抛出的简短描述
public void printStackTrace() 把异常的错误信息输出在控制台

 */
public class Exce {
    public static void main(String[] args) {
       try {a1();} // NullPointException
       catch (Throwable e){ //类祖宗
           e.printStackTrace();//直接输出详细错误内容
           System.out.println(e.getMessage());
       }
    }
    public  static  void a1(){
        Integer i = null;
        System.out.println(i.intValue());
    }
}
