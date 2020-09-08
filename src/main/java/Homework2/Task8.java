package Homework2;

public class Task8 {

    public static void maxInArray(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
    }

    public static void sumPositive(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма положительных элементов: " + sum);
    }

    public static void sumEvenNegative(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && (array[i] % 2 == 0)) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма четных отрицательных чисел: " + sum);
    }

    public static void quantityPositive(int[] array) {
        int quantity = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                quantity++;
            }
        }
        System.out.println("Кол-во положительных элементов: " + quantity);
    }

    public static void averageNegative(int[] array) {
        double average = 0;
        double count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
                average = average + array[i];
            }
        }
        System.out.println("Среднее арифметическое отрицательных эл-тов: " + average / count);
    }
}
