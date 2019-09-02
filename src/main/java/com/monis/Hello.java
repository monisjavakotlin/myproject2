package com.monis;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello monis");
        Person person = new Person("monis", 66.5f, 1.7f);
        person.hello();
        /*person.name = "monis";
        person.weight = 66.5f;
        person.height = 1.7f;*/
        System.out.println(person.bmi());

      /*  //basic data type
        int age = 19;
        char c = 'A';
        byte b = 120;
        float weight = 66.5f;
        double height = 1.7;
        boolean adult = true;
        boolean enroll = false;
        //reference data type - wrapper class
        Integer age2 = 29;
        Character c2 = 'B';
        String name = "Monis";*/

    }
}
