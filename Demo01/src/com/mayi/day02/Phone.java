package com.mayi.day02;

import com.mayi.day01.Children;

/**
 * @author Michel
 * @create 2022-08-08-17:30
 * @contact 724915929@qq.com
 */
public class Phone extends Children{
   private void call(String name){
        System.out.println("我是旧手机"+name);
    }
    void test(){
       call();
    }

}
