package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Arrays.toString(Problem1.getTwoNumbers(17, List.of(10, 15, 3, 7))));
        System.out.println(Problem2.count);
        Problem2 problem2 = new Problem2(33);
        Problem2 problem21 = new Problem2(44);
        problem2.show();
        problem21.show();
        Problem2.change();
        problem21.show();
    }
}