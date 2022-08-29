package com.mayikt.Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
   sleep(时间)指定当前线程阻塞的毫秒数
   sleep存在异常InterruptedException
   sleep时间达到后线程进入就绪状态
   sleep可以模拟网络延时，倒计时等
   每一个对象都有一个锁，sleep不会释放锁

 */
public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date(System.currentTimeMillis()); //obtenir la date actuelle
        while (true){
            try{
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
                date = new Date(System.currentTimeMillis());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
    //模拟倒计时
    public static void tenDown()throws InterruptedException{
        int num = 10;
        while(1==1){
            Thread.sleep(1000);
            System.out.println(num--);
            if (num<=0){
                break;
            }
        }
    }
}
