package com.mayikt.Thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

/**
 * callable 可以定义返回值 可以抛出异常
 *
 *
 */
public class TestCollable implements Callable {
    private String url;
    private String filename;
    public TestCollable(String url,String filename){
        this.url = url;
        this.filename = filename ;
    }
    @Override
    public Boolean call() { //下载图片的执行体
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,filename);
        System.out.println("下载文件名为："+filename);
        return true;
        //run方法线程体 单线程体
//        for(int i = 0; i<200;i++){
//            System.out.println("je programme"+i);
//        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCollable testCollable1 = new TestCollable("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F120405%2F10016-120405002T840.jpg&refer=http%3A%2F%2Fimg.juimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1664244509&t=f9b279b36b5bf164af5c160ac7c000cc","1.jpg");
        TestCollable testCollable2 = new TestCollable("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F120405%2F10016-120405002T840.jpg&refer=http%3A%2F%2Fimg.juimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1664244509&t=f9b279b36b5bf164af5c160ac7c000cc","2.jpg");
        TestCollable testCollable3 = new TestCollable("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F120405%2F10016-120405002T840.jpg&refer=http%3A%2F%2Fimg.juimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1664244509&t=f9b279b36b5bf164af5c160ac7c000cc","3.jpg");
        //创建执行服务
        ExecutorService service = Executors.newFixedThreadPool(3);
        //提交执行
        Future<Boolean> r1 = service.submit(testCollable1);
        Future<Boolean> r2 = service.submit(testCollable2);
        Future<Boolean> r3 = service.submit(testCollable3);
        //获取结果
        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();
        System.out.println("rs1:"+rs1+"\nrs2:"+rs2+"\nrs3:"+rs3);
        //关闭服务
        service.shutdown();

    }
}
