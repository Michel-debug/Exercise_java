package com.mayikt.Thread;

import com.mayikt.day14.Test14;

/**
 * 建议stop
 * 建议线程正常停止 利用次数 不建议死循环
 * 不要使用stop 或者 destroy 或者jdk不建议使用的方法
 */
public class TestStop implements Runnable{
    private boolean flag = true;
    @Override
    public void run() {
         while (flag){
             System.out.println("run --- thread");
         }
    }
    public void stop(){
        this.flag = false;
    }
    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();
        for (int i =0 ;i<1000;i++){
            System.out.println("main"+i);
            if (i==900) {
                testStop.stop();
                System.out.println("finished");
            }
        }
    }
}
