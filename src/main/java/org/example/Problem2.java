package org.example;

import java.util.Arrays;
import java.util.List;

public class Problem2 {

    int num;
    static int count = 22;

    public Problem2(int num) {
        this.num = num;
    }

    public static void change () {
        count = 222;
    }

    static {
        System.out.println("static block");
    }

    void show () {
        System.out.println("The number is " + num + ", the count is: " + count ) ;
    }
    /*
    Given an array of integers, return a new array such that each element at index i of the new array is the product of all
    the numbers in the original array except the one at i.
    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was
    [3, 2, 1], the expected output would be [2, 3, 6].
    Follow-up: what if you can't use division?
     */

    public int[] getFactors(int[] input) {
        List<Integer> integerList = Arrays.stream(input).boxed().toList();
        int[] output = new int[input.length];
        int mult = 1;
        for (int i = 0; i < integerList.size(); i++) {
            for (int j = 0; j < integerList.size(); j++) {
                if (i == j) {
                    continue;
                }
                mult *= integerList.get(j);
            }
            output[i] = mult;
            mult = 1;
        }
        return output;
    }

    public int[] getFactorsWithDivision(int[] input) {
        List<Integer> integerList = Arrays.stream(input).boxed().toList();
        int[] output = new int[input.length];
        int mult = 1;
        for (int i = 0; i < integerList.size(); i++) {
            for (int j = 0; j < integerList.size(); j++) {
                mult *= integerList.get(j);
            }
            mult /= integerList.get(i);
            output[i] = mult;
            mult = 1;
        }
        return output;
    }
}
