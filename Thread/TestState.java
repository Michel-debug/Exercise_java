package com.mayikt.Thread;

import sun.awt.windows.ThemeReader;

//观察测试线程的状态
// 死亡后的线程不能在进行执行 线程中断或者结束，一旦进入死亡状态，就不能再次启动
public class TestState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("//////");
        });
        Thread.State state = thread.getState();  //new
        System.out.println(state);
        thread.start();// declencher ce thread   start
        state = thread.getState();
        System.out.println(state); //run
        while (state != Thread.State.TERMINATED) { //只要线程不终止，就一直输出状态
            Thread.sleep(100);
            state = thread.getState(); //mis a jour le stat
            System.out.println(state);// output
        }
    }
}