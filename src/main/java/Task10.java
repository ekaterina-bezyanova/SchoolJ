import java.util.Arrays;

public class Task10 {

    public static void zeroToEnd(int[] array) {
        int zeroCounter = 0;
        int i = 0;

        do {
            if ((array[i] == 0) || (array[i + zeroCounter]) == 0)
                zeroCounter++;
            array[i] = array[i + zeroCounter];
            i++;
            System.out.println("zero c" + zeroCounter);
        } while ((zeroCounter + i) != array.length);

        for (int j = 0; j < zeroCounter; j++) {
            array[array.length - 1 - j] = 0;
        }

        System.out.println(Arrays.toString(array));
    }
}
