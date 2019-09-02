package many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();
        ArrayList list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add("abc");
        list.add(true);
        System.out.println(list);
        int n1 = (int) list.get(0);
        String s = (String) list.get(2);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(3);
        list1.add(9);
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println();

        List<Integer> scores = Arrays.asList(32, 6, 61, 758, 23, 32);
        for (int score:scores) {
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
//        numbers[5] = 7;
        int[] score = {67, 22, 35, 76, 86};
        System.out.println(score);

        for (int i = 0; i < 5; i++) {
            System.out.println(score[i]);
        }
        System.out.println();

        for (int n : score) {
            System.out.println(n);
        }
    }
}
