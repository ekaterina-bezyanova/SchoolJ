import java.util.Scanner;

public class Task1 {

    public static void enterNumber() {
        int value = 0;
        System.out.println("Задание_1");
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            value = scanner.nextInt();
            if (value < 0) value = value * (-1);
            makeNumber(value);
        }
        else System.out.println("Введите целое число");
    }

    public static void makeNumber(int i) {
        do {
            if (i / 10 > 0)
                i = i % 10;
            else
                break;
        } while (i > 0);
        System.out.println("Последняя цифра вашего числа: " + i % 10);
    }
}
