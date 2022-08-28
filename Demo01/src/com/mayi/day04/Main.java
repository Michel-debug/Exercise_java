package com.mayi.day04;

/**
 * @author Michel
 * @create 2022-08-09-18:08
 * @contact 724915929@qq.com
 */
public class Main {
    public static void main(String[] args) {
        AnimalDemo animalDemo = new AnimalDemo();
        Animalmanipuler animalmanipuler = new Animalmanipuler();
//        animalmanipuler.userCat(new Cat());
//        animalmanipuler.userDog(new Dog());
        animalmanipuler.userAnimal(new Cat());
        AnimalDemo animalDemo1 = new Cat();
        AnimalDemo animalDemo2 = new Dog();
        Cat cat = (Cat)animalDemo1;
        cat.show();
        Dog dog = (Dog)animalDemo2;
        Cat cat1=(Cat)animalDemo2;  //运行时异常，因为animaldemo2此时是dog类型 无法转换成cat,跟cat没关系
        dog.show();
        cat1.show();
    }
}
