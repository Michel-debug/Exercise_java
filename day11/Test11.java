package com.mayikt.day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Test11 {
    static  ArrayList<Student> students = new ArrayList<Student>();
    public static void main(String[] args) {
//        Student mayikt01 = new Student("Michel",22);
//        Student mayikt02 = new Student("Michel",23);
//        Student mayikt03 = new Student("Michel",24);
//        Student mayikt04 = new Student("Michel",25);
//        Student mayikt05 = new Student("Michel",26);

//        students.add(mayikt01);
//        students.add(mayikt02);
//        students.add(mayikt03);
//        students.add(mayikt04);
//        students.add(mayikt05);
//        for (int i = 0;i<students.size();i++){
//            System.out.println(students.get(i));
//        }
        while(true) {
            System.out.println("1.ajouter un nouveau etudiant");
            System.out.println("2. modifier un etudiant");
            System.out.println("3. supprimer un etudiant");
            System.out.println("4. renseigner sur un etudiant");
            System.out.println("5. quitter systeme d'etudiant");

            int num = new Scanner(System.in).nextInt();
            switch (num) {
                case 1:
                    System.out.println("ajouter un etudiant");
                    System.out.println("name:");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println("age: ");
                    int age = new Scanner(System.in).nextInt();
                    addStudiant(name,age);
                    break;
                case 2:
                    System.out.println("2. modifier un etudiant");
                    break;
                case 3:
                    System.out.println("3. supprimer un etudiant");
                    break;
                case 4:
                    System.out.println("4. renseigner sur un etudiant");
                    consulter();
                    break;
                case 5:
                    System.out.println("5. quitter systeme d'etudiant");
                    break;
            }
        }
    }
    public  static void addStudiant(String name , int age){
        Student num_1 = new Student(name,age);
        students.add(num_1);
    }
    public static void consulter(){
        for (int i = 0;i<students.size();i++){
            System.out.println(students.get(i));
        }
    }
}
