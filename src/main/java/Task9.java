import java.util.Arrays;

public class Task9 {

    public static void invertArray(int[] array) {
        int j = array.length;

        for (int i = 0; i < j/2; i++) {
            int temp = array[i];
            array[i] = array[j - i - 1];
            array[j - i - 1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
