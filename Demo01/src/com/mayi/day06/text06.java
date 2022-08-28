package com.mayi.day06;

/**
 * @author Michel
 * @create 2022-08-12-11:04
 * @contact 724915929@qq.com
 */

public class text06 {
    //从外界访问内部类 外部类.内部类 = new 外部类().new 内部类()
    // 静态内部类访问形式  外部类.内部类 = new 外部类.内部类()
    //局部内部类 只能在该方法里面访问，不能在方法外访问。 但是局部内部类 可以访问成员变量 和 方法
    public static void main(String[] args) {
        Externieur.ExternieurB externieurB = new Externieur().new ExternieurB();
        //通过私有形式 让外界不让访问内部类，但是可以用外部类 调用内部类
    }
}
