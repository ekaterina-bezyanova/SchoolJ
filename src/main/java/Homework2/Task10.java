package Homework2;

import java.util.Arrays;

public class Task10 {

    public static void zeroToEnd(int[] array) {
        int zeroCounter = 0;

        for (int i = 0; (i + zeroCounter) != array.length; i++) {
            if ((array[i] == 0) || (array[i + zeroCounter]) == 0) {
                zeroCounter++;
            }
            array[i] = array[i + zeroCounter];
        }

        for (int j = 0; j < zeroCounter; j++) {
            array[array.length - 1 - j] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
