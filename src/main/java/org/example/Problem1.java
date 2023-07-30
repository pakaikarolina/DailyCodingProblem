package org.example;

import java.util.List;

public class Problem1 {

    /*
    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
     */

    public static int[] getTwoNumbers(int k, List<Integer> list) {
        int[] ints = new int[2];

        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                int a = list.get(i);
                int b = list.get(j);
                if (a+b == k) {
                    ints[0] = a;
                    ints[1] = b;
                }
            }
        }
        return ints;
    }
}
