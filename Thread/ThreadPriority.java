package com.mayikt.Thread;

public class ThreadPriority {
    public static void main(String[] args) {
        // 主线程默认优先级 5
        System.out.println(Thread.currentThread().getName()+"--->"+Thread.currentThread().getPriority());
        MyPriority myPriority = new MyPriority();
        Thread t1 = new Thread(myPriority,"a");
        Thread t2 = new Thread(myPriority,"b");
        Thread t3 = new Thread(myPriority,"c");
        Thread t4 = new Thread(myPriority,"d");
        Thread t5 = new Thread(myPriority,"e");
        Thread t6 = new Thread(myPriority,"f");
        Thread t7 = new Thread(myPriority,"g");
        Thread t8 = new Thread(myPriority,"h");
        //先设置优先级，再启动 设置优先级 只能让其被调度的概率变高 并不是绝对的
        t1.start();
        t2.setPriority(1);
        t2.start();
        t3.setPriority(4);
        t3.start();
        t4.setPriority(Thread.MAX_PRIORITY);
        t4.start();

    }
}
class MyPriority implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--->"+Thread.currentThread().getPriority());
    }
}

