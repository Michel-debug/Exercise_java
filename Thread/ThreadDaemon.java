package com.mayikt.Thread;

public class ThreadDaemon {

    public static void main(String[] args) {
        God god = new God();
        Humain humain = new Humain();
        Thread thread = new Thread(god);
        thread.setDaemon(true); //默认是false 表示用户线程，正常的线程都是用户线程，除非你加入此函数 表示守护线程
        thread.start();//守护线程  人生不过三万天
        new Thread(humain).start(); //用户线程
    }
}
class Humain implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("你一生都开心的活着");
        }
        System.out.println("goodby！ world！");
    }
}
class God implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("上帝保佑你");
        }
    }
}
