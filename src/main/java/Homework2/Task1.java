package Homework2;

import java.util.Scanner;

public class Task1 {

    public static void enterNumber() {
        int value;
        System.out.println("Задание_1");
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
        System.out.println("Последняя цифра вашего числа: " + Math.abs(i) % 10);
    }
}
