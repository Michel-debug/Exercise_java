package com.mayi.day08;

import java.util.Objects;

/**
 * @author Michel
 * @create 2022-08-14-20:30
 * @contact 724915929@qq.com
 */
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; // 比较两个对象的类型不一样的话 返回false
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    // 对象的引用 instance of 具体的类型（类或者是接口）
    // 在编译状态中，class可以是object对象的父类，自身类，子类。在这种情况下不会编译报错。
    // 在运行状态中，class可以是object对象的父类，自身类，不能是子类。
    //前两种情况下result 的结果为true,最后一种为false.但是class为子类时编译不会报错。运行结果为false.
}
public class  Test02 {

    public static void main(String[] args) {
        Student student1= new Lyseen("Michel",22);
        Student student2= new Eleve("Michel",22);

       // System.out.println(student1.equals(student2));
        if (student1 instanceof  Lyseen){
            Lyseen lyseen = (Lyseen)student1;
            System.out.println("该对象是学生类型可以强转");
        }else{
            System.out.println("该对象引用不是学生类型无法强转");
        }
        Score score = new Lyseen("haha",123);
        //判断该对象引用是否是为该类型（自身类，自身类父类，object）都是直接返回true,其他情况返回false
        if (score instanceof Lyseen){
            Lyseen lyseen = (Lyseen) score;
            System.out.println("是该类型");
        }else{
            System.out.println("不是该类型");
        }
    }
}

class Lyseen extends  Student implements Score{

    public Lyseen(String name, int age) {
        super(name, age);
    }
}
class Eleve extends Student{

    public Eleve(String name, int age) {
        super(name, age);
    }
}