package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem2Test {

    Problem2 problem2 = new Problem2(2);

    @Test
    void getFactorsRunInGreenPath() {
        //given
        int[] input;
        input = new int[]{1, 2, 3, 4, 5};

        //when
        int[] result = problem2.getFactorsWithDivision(input);
        int[] result2 = problem2.getFactorsWithDivision(input);

        //then
        int[] expected = new int[]{120, 60, 40, 30, 24};
        assertArrayEquals(expected, result);
        assertArrayEquals(expected, result2);
    }
}