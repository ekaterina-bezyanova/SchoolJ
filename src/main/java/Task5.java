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
            }
            else {
                in.nextLine();
                System.out.println("Введите корректное целое число");
            }
        } while (wentToCatch < 3);

        makeNumber(array[0], array[1], array[2]);
    }

    public static void makeNumber(int i, int y, int j) {
        if (i <= y && i <= j)
            System.out.println("Минимум из трех чисел: " + i);
        else if (y <= i && y <= j)
            System.out.println("Минимум из трех чисел: " + y);
        else
            System.out.println("Минимум из трех чисел: " + j);
    }
}
