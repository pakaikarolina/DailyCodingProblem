package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    Problem4 problem4 = new Problem4();

    @Test
    void lowestPosWithGreenPath() {
        //given
        int[] ints = new int[]{3,4,-1,1};

        //when
        int result = problem4.lowestPos(ints);

        //then
        assertEquals(2, result);
    }

    @Test
    void lowestPosWithGreenPath2() {
        //given
        int[] ints = new int[]{1,2,0};

        //when
        int result = problem4.lowestPos(ints);

        //then
        assertEquals(3, result);
    }
}