package com.mayi.day04;

/**
 * @author Michel
 * @create 2022-08-09-18:07
 * @contact 724915929@qq.com
 */
public class Animalmanipuler {
    //动物操作类
    public void userCat(Cat cat){
        cat.eat();
    }
    public void userDog(Dog dog){
        dog.eat();
    }
    public  void userAnimal(AnimalDemo animalDemo){
        //多态访问
//        AnimalDemo cat = new Cat();
//        cat.eat();
//        AnimalDemo dog = new Dog();
//        dog.eat();
          animalDemo.eat();
    }
}
