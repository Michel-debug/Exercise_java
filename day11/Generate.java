package com.mayikt.day11;

public class Generate {
    /**
     * 泛型类格式
     * public class mayikt<T> 这里的字母没有特殊要求，一般为 T,V,M,K,E
     * private T t; 在类中定义的成员属性 泛型Te类型与我们在类上
     */

}
class Studiant<T> implements Intergenerate<T>{
    private T stu_name;

    public T getStu_name() {
        return stu_name;
    }

    public void setStu_name(T stu_name) {
        this.stu_name = stu_name;
    }


    @Override
    public <T1> T1 show(T1 t1) {
        return null;
    }

    @Override
    public <M> T show2(T t, M m) {
        System.out.println(t+""+m);
        return t;
    }
}
