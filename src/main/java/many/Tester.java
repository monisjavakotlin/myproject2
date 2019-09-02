package many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();
//        list();
//        set();
        map();
    }

    private static void map() {
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "TSMC");
        stocks.put("2317", "HONHAI");
        System.out.println(stocks.get("2330"));
        System.out.println(stocks);
        System.out.println();
        for (String key : stocks.keySet()) {
            System.out.println(stocks.get(key));
        }
    }

    private static void set() {
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(8);
        set.add(1);
        set.add(4);
        set.add(8);
        System.out.println(set);
        for (int n : set) {
            System.out.println(n);
        }
    }

    private static void list() {
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
        for (int score : scores) {
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
