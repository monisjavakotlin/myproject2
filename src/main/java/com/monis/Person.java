package com.monis;

public class Person {
    String name;
    float weight;
    float height;

    public Person() {
    }

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height) {
        this(weight, height);
        this.name = name;
    }

    public float bmi() {
        float BMI = weight / (height * height);
        return BMI;
    }


    public void hello() {
        System.out.println("Hello Person");
    }
}
