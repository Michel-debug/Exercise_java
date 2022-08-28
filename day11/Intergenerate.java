package com.mayikt.day11;

public interface Intergenerate<T> {
    <T> T show(T t);
    //第一个是泛型方法 形参也是泛型方法 返回类型也是泛型方法
    //如果是 T show (T t) 则返回的是泛型接口
    //如果既想要获得泛型接口 又想要泛型方法
    <M> T show2(T t,M m);
}
