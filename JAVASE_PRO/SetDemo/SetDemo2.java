package com.JAVASE_PRO.SetDemo;

import java.util.HashSet;
import java.util.Objects;

public class SetDemo2 {
    public static void main(String[] args) {
        HashSet<Student> sets = new HashSet<>();
        Student s1 = new Student("AMY","001",18);
        Student s2 = new Student("AM","002",17);
        Student s3 = new Student("AY","003",19);
        Student s4 = new Student("MY","004",18);
        Student s5 = new Student("AMY","005",18);
        Student s6 = new Student("AMY","001",18);
        System.out.println(s1.hashCode());
        System.out.println(s6.hashCode());
        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        sets.add(s4);
        sets.add(s5);
        sets.add(s6);
        System.out.println(sets);

    }
}

class Student /*implements Comparable<Student>*/{
       private String name;
       private String ID;
       private int age;

    public Student(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(ID, student.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID, age);
    }
    /*
    @Override
    public int compareTo(Student o) {
        return this.age - o.age >= 0 ? 1:-1;
    }*/
}