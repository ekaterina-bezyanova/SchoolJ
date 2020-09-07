import java.util.Scanner;

public class Task2 {

    public static void enterNumber() {
        int value = 0;
        System.out.println("Задание_2");
        System.out.println("Введите целое трехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            value = scanner.nextInt();
            if (value >= 100 && value <= 999) {
                makeNumber(value);
            }
            else System.out.println("Введите целое трехзначное число");
        }
        else System.out.println("Введите целое трехзначное число");
    }

    public static void makeNumber(int i) {
        int sum = 0;
        do {
            if (i / 10 > 0) {
                sum = sum + (i % 10);
                i = i / 10;
            }
            else {
                sum = sum + i;
                break;
            }
        } while (i > 0);
        System.out.println("Сумма цифр вашего числа: " + sum);
    }
}
