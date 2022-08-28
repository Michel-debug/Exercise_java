package com.mayikt.Thread;

public class TestThread1 implements Runnable{
    private int ticketnums = 10;
    @Override
    public void run() {
        while(ticketnums>0){
            try {
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketnums--+"票");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        TestThread1 testThread1 = new TestThread1();
        Thread michel = new Thread(testThread1, "michel");
        Thread veronique = new Thread(testThread1, "Veronique");
        Thread Veau = new Thread(testThread1,"丑黄牛");
        michel.start();
        veronique.start();
        Veau.start();

    }
}
