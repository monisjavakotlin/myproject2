package com.monis.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int hightest() {
//        int max = (english > math) ? english : math;
       /* if (english > math) {
            max = english;
        } else {
            max = math;
        }*/
        return (english > math) ? english : math;
    }

    public void print() {
        int average = getAverage();
        System.out.println(name + "\t" + english + "\t" + math
                + "\t" + getAverage() + "\t" +
                ((average >= 60) ? "PASS" : "FAILED"));
       /* if (getAverage() >= 60) {
            System.out.println("\tPASS");
        } else {
            System.out.println("\tFAILED");
        }*/
    }

    public int getAverage() {
        return (english + math) / 2;
    }
}
