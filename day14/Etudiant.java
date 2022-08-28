package com.mayikt.day14;

import com.mayikt.day11.Student;

import java.util.Objects;

public class Etudiant {
    private String name;
    private Integer age;

    public Etudiant(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
       Etudiant student = (Etudiant) o;
        if (this.name.equals(student.name)&&this.age.equals(student.age)) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+this.age.hashCode();
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
