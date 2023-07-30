package org.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCode {

    public void countB(String s) {
        int[] nums = new int[0];
        Arrays.stream(nums).boxed().mapToInt(n -> n).sum();
        int n = 0;

        char c = 0;
        Integer.parseInt(String.valueOf(c));
        String sl = String.valueOf(n);
        sl.toCharArray();
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            continue;
        }


    }

    //given 2 arrays of numbers with the same length and an integer. find the two numbers from the two arrays for which
    // their sum will be the closest to the given int
    public int[] sumofarrays(int[] arrayA, int[] arrayB, int goal) {
        int tempSum = 0;
        int diff = 0;
        int min = Integer.MAX_VALUE;
        int[] ints = new int[2];

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                tempSum = arrayA[i] + arrayB[j];
                diff = Math.abs(goal - tempSum);
                if (min > diff) {
                    min = diff;
                    ints[0] = arrayA[i];
                    ints[1] = arrayB[j];
                }
            }
        }
        return ints;
    }

    public int[] sumOfArrays2(int[] arrayA, int[] arrayB, int goal) {
        int[] ints = new int[2];
        Set<Integer> setA = Arrays.stream(arrayA).boxed().collect(Collectors.toSet());
        for (int counter = 1; counter < goal; counter++) {

            for (int i = 0; i < arrayB.length; i++) {
                int missing = goal - arrayB[i];
                if (setA.contains(missing)) {
                    ints[0] = missing;
                    ints[1] = arrayB[i];
                    return ints;
                }
            }
            int goalMinus = goal - counter;
            for (int i = 0; i < arrayB.length; i++) {
                int missing = goalMinus - arrayB[i];
                if (setA.contains(missing)) {
                    ints[0] = missing;
                    ints[1] = arrayB[i];
                    return ints;
                }
            }
            int goalPlus = goal + counter;
            for (int i = 0; i < arrayB.length; i++) {
                int missing = goalPlus - arrayB[i];
                if (setA.contains(missing)) {
                    ints[0] = missing;
                    ints[1] = arrayB[i];
                    return ints;
                }
            }
        }
        return ints;
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int first;
        int second;

        if (sequence.size() == 1 && !array.contains(sequence.get(0))) {
            return false;
        }

        if (sequence.size() == array.size() && !array.equals(sequence)) {
            return false;
        }
        for (int i = 0; i < sequence.size() - 1; i++) {
            if (!array.contains(sequence.get(i)) && !array.contains(sequence.get(i + 1))) {
                return false;
            }
            first = array.indexOf(sequence.get(i));
            second = array.indexOf(sequence.get(i + 1));
            if (first > second) {
                return false;
            }
        }
        return true;
    }

    public int[] searchRange(int[] nums, int target) {
        BigInteger n = BigInteger.ONE;

        String s = String.valueOf(n);
        String substring = getSubstring(s);
        if (!substring.matches("^00$")) {
            getSubstring(substring);
        }
        return null;
    }

    private static String getSubstring(String s) {
        String[] strings = s.split("");
        List<String> stringList = Arrays.stream(strings).toList();
        int i = stringList.indexOf("0");
        String substring = s.substring(i);
        return substring;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        int result;
        List<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        for (int i = 0; i < nums.length; i++) {
            result = target - nums[i];
            list.set(i, null);
            if (list.contains(result)) {
                output[0] = i;
                output[1] = list.indexOf(result);
                return output;
            }
        }

        return output;
    }

    public static int solution(int[] A) {
        List<Integer> list = Arrays.stream(A).boxed().sorted().toList();
        int j = 1;
        while (list.contains(j)) {
            j++;
        }
        return j;
    }
}
