package net.vrakin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */


class AppTest {

    public static final int FACTORIAL_THREE = 6;

    @Test
    void factorialTest() {
        int factorialTest = FACTORIAL_THREE;
        int[] testArray = new int[12];
        int[] expectedArray = new int[12];

        for (int i = 4; i < 16; i++) {
            factorialTest *= i;
            testArray[i - 4] = factorialTest;
            expectedArray[i - 4] = BasicTasks.factorial(i);
        }

        Assertions.assertArrayEquals(testArray, expectedArray);
    }



}
