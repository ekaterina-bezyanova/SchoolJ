package Homework5.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Выберите операцию: ");
        System.out.println("Введите 1 для сложения");
        System.out.println("Введите 2 для вычитания");
        System.out.println("Введите 3 для умножения");
        System.out.println("Введите 4 для деления");
        Scanner scanner = new Scanner(System.in);
        int operator = scanner.nextInt();

        System.out.println("Введите два числа: ");
        Scanner scanner1 = new Scanner(System.in);
        double operand1 = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        double operand2 = scanner2.nextDouble();

        Calculator calc = new Calculator();

        switch (operator) {
            case 1:
                calc.addition(operand1, operand2);
                break;
            case 2:
                calc.subtraction(operand1, operand2);
                break;
            case 3:
                calc.multiplication(operand1, operand2);
                break;
            case 4:
                calc.division(operand1, operand2);
                break;
            default:
                System.out.println("Введите корректный номер операции");
        }
    }
}
