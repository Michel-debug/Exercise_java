package com.mayikt.Thread;

public class ThreadJoin implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("thread vient");

        }
    }

    public static void main(String[] args) throws InterruptedException {
        //启动我们的线程
        ThreadJoin threadJoin = new ThreadJoin();
        Thread thread = new Thread(threadJoin);
        thread.start();
        //主线程
        for (int i = 0; i < 500; i++) {
            if (i ==150)
            {
               thread.join(); //laisse les autres threads attendre
            }
            System.out.println("main"+i);
        }
    }
}
