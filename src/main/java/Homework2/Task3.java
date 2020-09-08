package Homework2;

import java.util.Scanner;

public class Task3 {

    public static void enterNumber() {
        int value;
        System.out.println("Задание_3");
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
            makeNumber(value);
        } else {
            System.out.println("Введите корректное целое число");
        }
    }

    public static void makeNumber(int i) {
        if (i > 0) {
            i = i + 1;
            System.out.println("Полученное число: " + i);
        } else {
            System.out.println("Полученное число: " + i + " (не изменено)");
        }
    }
}
