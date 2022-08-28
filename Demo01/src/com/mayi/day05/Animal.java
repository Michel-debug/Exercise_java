package com.mayi.day05;

/**
 * @author Michel
 * @create 2022-08-11-21:02
 * @contact 724915929@qq.com
 */
public abstract class Animal {
    public static final int CODE=404;
    /*
    抽象类中可以定义非抽象方法，也可以不存在抽象方法，但是不能实例化
    子类必须要重写所有抽象方法，因为他们没有被实现，所以在子类中必须继承
    如果子类也是抽象类 则没有要求一定要重写抽象方法，继承父类的抽象方法
     */
    abstract void show();
    void eat(){
        System.out.println("普通方法");
    };
}
