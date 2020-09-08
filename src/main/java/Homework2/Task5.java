package Homework2;

import java.util.Scanner;

public class Task5 {

    public static void enterNumber() {
        int array[] = new int[3];
        int wentToCatch = 0;
        System.out.println("Задание_5");
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Введите целое число: ");
            if (in.hasNextInt()) {
                array[wentToCatch] = in.nextInt();
                wentToCatch++;
            } else {
                in.nextLine();
                System.out.println("Введите корректное целое число");
            }
        } while (wentToCatch < 3);

        makeNumber(array);
    }

    public static void makeNumber(int array[]) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимум из трех чисел: " + min);
    }
}
