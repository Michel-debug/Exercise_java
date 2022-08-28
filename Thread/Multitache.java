package com.mayikt.Thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 线程类Thread类
 * 重写run方法 编写线程执行体
 * 创建线程对象，调用start（）方法
 *
 * recapitulatif：attention， 线程开启不一定立即执行，由cpu调度执行
 *
 * 练习实现多线程同步下载器
 *
 * 子类继承thread类具备多线程能力
 * 启动线程： 子类对象.start()
 * 不建议使用 避免oop单继承局限性
 *
 * 实现Runnable接口
 * 实现接口Runnable具有多线程能力
 * 启动线程：传入目标对象 + Thread对象.start()
 * 推荐使用：避免单继承局限性，灵活方便，方便同一个对象被多个线程使用
 *
 *
 */
public class Multitache extends Thread{
    private String url;
    private String filename;
    public Multitache(String url,String filename){
        this.url = url;
        this.filename = filename ;
    }
    @Override
    public void run() { //下载图片的执行体
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,filename);
        System.out.println("下载文件名为："+filename);
        //run方法线程体 单线程体
//        for(int i = 0; i<200;i++){
//            System.out.println("je programme"+i);
//        }
    }

    public static void main(String[] args) {
        Multitache multitache1 = new Multitache("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F120405%2F10016-120405002T840.jpg&refer=http%3A%2F%2Fimg.juimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1664244509&t=f9b279b36b5bf164af5c160ac7c000cc","1.jpg");
        Multitache multitache2 = new Multitache("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F120405%2F10016-120405002T840.jpg&refer=http%3A%2F%2Fimg.juimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1664244509&t=f9b279b36b5bf164af5c160ac7c000cc","2.jpg");
        Multitache multitache3 = new Multitache("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F120405%2F10016-120405002T840.jpg&refer=http%3A%2F%2Fimg.juimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1664244509&t=f9b279b36b5bf164af5c160ac7c000cc","3.jpg");
        //调用start方法
        multitache1.start();//多线程方法
        multitache2.start();//多线程方法
        multitache3.start();//多线程方法
        StartThread3 startThread3 = new StartThread3(); //创建runnable接口的实现类对象
        Thread thread = new Thread(startThread3); //创建线程对象，通过线程对象来开启我们的线程，代理
        thread.start();
        new Thread(multitache1).start();
        //主线程
//        for(int i = 0; i<20;i++){
//            System.out.println("j'apprends le multitache:"+i);
//        }
    }
}
class WebDownloader{
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        }catch (IOException ioException){
            ioException.printStackTrace();
            System.out.println("IO exception,methode down erreur!");
        }
    }
}
// 实现线程方式2 ： 实现runnable 接口，重写run方法，执行线程需要丢入runnable接口实现类，调用start方法。
class StartThread3 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<200;i++){
          System.out.println("je programme"+i);
        }
    }
}