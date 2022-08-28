package com.mayikt.Thread;

public class Race implements Runnable{
    public static String winner;
    public void  run(){
        for (int i = 0 ; i<=100 ;i++){
            //模拟兔子休息
            if(Thread.currentThread().getName().equals("robet")&& i%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            boolean flag = gameOver(i);
            if (flag) break;
            System.out.println(Thread.currentThread().getName()+"-->跑了"+i+"步");
        }
    }

    //判断是否完成比赛
    private boolean gameOver(int step){
      //判断是否有胜利者
        if(winner !=null){
            return true;
        }
        if (step>=100){
            winner=Thread.currentThread().getName();
            System.out.println("winner is "+winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"robet").start();
        new Thread(race,"tube").start();
    }
}
