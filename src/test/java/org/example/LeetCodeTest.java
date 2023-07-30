package org.example;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeTest {

    LeetCode leetCode;

    @BeforeEach
    void setUp() {
        leetCode = new LeetCode();
    }

    @Test
    @Ignore
    void count6() {
        //given
        String input = "00110011";

        //when

        //then
    }

    @Test
    @Ignore
    void compareStrings() {
        //given
        String input = "00110011";

        //when

        //then
    }

    @Test
    void sumgives25() {
        //given
        int[] arrayA = {-1, 3, 8, 2, 9, 5};
        int[] arrayB = {4, 1, 2, 10, 5, 20};
        int goal = 24;

        //when
        int[] result = leetCode.sumOfArrays2(arrayA, arrayB, goal);

        //then
        int[] expected2 = {3, 20};
        assertEquals(Arrays.toString(expected2), Arrays.toString(result));
    }

    @Test
    void isValid() {
        //given
        List<Integer> array = List.of(1,2,3,4);
        List<Integer> sequence = List.of(1, 4);

        boolean result = LeetCode.isValidSubsequence(array, sequence);

        assertTrue(result);
    }
}