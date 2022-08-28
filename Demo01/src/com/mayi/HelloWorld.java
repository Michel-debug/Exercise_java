package com.mayi;

/**
 * @author Michel
 * @create 2022-08-08-8:01
 * @contact 724915929@qq.com
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World !");
        int j = 20;
        int i = 10;
        int [] array = new int[10];
        System.out.println(array[0]);
        Phone apple = new Phone();
        apple.brand="APPLE";
        apple.price=150;
        apple.print();
    }
}
/*
 构造方法的应用场景：
 无参构造方法： 该构造方法没有任何传递参数
 有参构造方法：有传递参数
 如果类中没有定义构造方法系统会自动生成一个

 */
class Phone{
    String brand;
    int price;
    public Phone(){
        System.out.println("开始初始化");
    }
    public Phone(String brand){
        this.brand=brand;
    }
    public Phone(int price){
        this.price=price;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setPrice(int price){
        this.price=price;
    }
    private void prix(){
        System.out.println("牌子:"+brand);
    }
    public void print(){
        prix();
    }
}
