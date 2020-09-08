package Homework2;

import java.util.Scanner;

public class Task4 {

    public static void enterNumber() {
        int value;
        System.out.println("Задание_4");
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
            makeNumber(value);
        } else {
            System.out.println("Введите целое число");
        }
    }

    public static void makeNumber(int i) {
        if (i > 0) {
            i = i + 1;
        } else {
            if (i < 0) {
                i = i - 2;
            } else {
                i = 10;
            }
        }
        System.out.println("Полученное число: " + i);
    }
}
