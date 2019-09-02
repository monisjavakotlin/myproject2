package com.monis.student;

import com.monis.Studentkt;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
//        Studentkt.setPass(50);
        Student.pass = 50;
        Student student = new Student("monis", 77, 30);
        Student student2 = new Student("snow", 60, 40);
        Student student3 = new Student("lulu", 77, 99);
        Student gstudent = new GraduateStudent("max", 60, 55, 65);
        student.print();
        System.out.println("Highest score: " + student.hightest());
        student2.print();
        System.out.println("Highest score: " + student2.hightest());
        student3.print();
        System.out.println("Highest score: " + student3.hightest());
        gstudent.print();
        System.out.println("Highest score: " + gstudent.hightest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sytudent's name:");
        String name = scanner.next();
        System.out.println("Please enter sytudent's english score:");
        int english = scanner.nextInt();
        System.out.println("Please enter sytudent's math score:");
        int math = scanner.nextInt();
        Student student = new Student(name, english, math);
        student.print();
        System.out.println(student.hightest());
    }
}
