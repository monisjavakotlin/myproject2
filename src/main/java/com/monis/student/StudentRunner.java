package com.monis.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student student = new Student("monis", 77, 99);
        student.print();
        System.out.println(student.hightest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sytudent's name:");
        String name = scanner.next();
        System.out.println("Please enter sytudent's english score:");
        int english=scanner.nextInt();
        System.out.println("Please enter sytudent's math score:");
        int math=scanner.nextInt();
        Student student = new Student(name, english, math);
        student.print();
        System.out.println(student.hightest());
    }
}
