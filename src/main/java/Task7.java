import java.util.Scanner;

public class Task7 {

    public static void enterNumber() {
        int value = 0;
        System.out.println("Задание_7");
        System.out.println("Введите код города: ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            value = scanner.nextInt();
                makeNumber(value);
        }
        else System.out.println("Введите корректный код города");
    }

    public static void makeNumber(int i) {

        switch (i) {
            case 905:
                System.out.println("Москва. Стоимость разговора: " + 4.15 * 10);
                break;
            case 194:
                System.out.println("Ростов. Стоимость разговора: " + 1.98 * 10);
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора: " + 2.69 * 10);
                break;
            case 800:
                System.out.println("Киров. Стоимость разговора: " + 5.00 * 10);
                break;
            default:
                System.out.println("Введите корректный код города"); }
    }
}
