import java.util.Scanner;

public class Task6 {

    public static void enterNumber() {
        int value = 0;
        System.out.println("Задание_6");
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            value = scanner.nextInt();
            makeNumber(value);
        }
        else System.out.println("Введите целое число");
    }

    public static void makeNumber(int i) {
        String sign;
        String even;

        if (i > 0)
            sign = "положительное";
        else
            sign = "отрицательное";

        if (i % 2 == 0)
            even = "четное";
        else
            even = "нечетное";

        if (i == 0)
            System.out.println("нулевое число");
        else
            System.out.println(sign + " " + even + " число");
    }
}
