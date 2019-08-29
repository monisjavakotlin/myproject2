package com.monis.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
    /*    int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println("");*/
        int secret = new Random().nextInt(10) + 1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("請輸入一個數字(" + i + "/4): ");
            int number = scanner.nextInt();
            System.out.println("第" + i + "次" + number);
            if (number < secret) {
                System.out.println("higher");
            } else if (number > secret) {
                System.out.println("lower");
            } else {
                System.out.println("Great,you got it");
                break;
            }
        }
        System.out.println("結束");
    }
}
