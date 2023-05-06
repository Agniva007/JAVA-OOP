package com.agniva.introduction;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
//        Student agni;
//        agni = new Student();

        Student agni = new Student(15, "Agniva Das", 85.4f);
        Student rai = new Student(18, "Rai", 90.3f);

//        agni.rno = 13;
//        agni.name = "Agniva Das";
//        agni.marks = 88.5f;


//        agni.changeName("Shoe lover");
//        agni.greeting();

//
        System.out.println(agni.rno);
        System.out.println(agni.name);
        System.out.println(agni.marks);

        Student random = new Student(agni);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);
        System.out.println(random2.marks);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);

    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }


    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
