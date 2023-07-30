package org.example;


import org.junit.platform.commons.util.StringUtils;

import java.lang.Object;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem4 {

    /*
    Given an array of integers, find the first missing positive integer in linear time and constant space.
    In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

    For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
     */

    public int lowestPos(int[] input) {
        int output = 0;
        List<Integer> integerList = Arrays.stream(input).boxed().toList();
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!integerList.contains(i)) {
                output = i;
                break;
            }
        }
        return output;
    }

    public int calPoints(String[] operations) {
        int sum = 1;
        List<Integer> records = new LinkedList<>();
        for (String operation : operations) {
            int sumPlus;
            if (operation.equals("+")) {
                if (records.size() >= 2) {
                    int a = records.get(records.size() - 1);
                    int b = records.get(records.size() - 2);
                    sumPlus = a + b;
                    records.add(sumPlus);
                }
            } else if (operation.equals("D")) {
                if (records.size() >= 1) {
                    sumPlus = records.get(records.size() - 1) * 2;
                    records.add(sumPlus);
                }
            } else if (operation.equals("C")) {
                if (records.size() >= 1) {
                    records.remove(records.size() - 1);
                }
            } else {
                records.add(Integer.parseInt(operation));
            }
        }
        sum = records.stream()
                .mapToInt(x -> x)
                .sum();
        return sum;
    }

}