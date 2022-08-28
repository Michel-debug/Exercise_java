package com.mayi.day02;

/**
 * @author Michel
 * @create 2022-08-08-17:30
 * @contact 724915929@qq.com
 */
public class NewPhone extends Phone{
    //父类方法中的 私有方法不能进行重写
    private  void call(String name){
        System.out.println("我是新手机:"+name);
    }
}
