package Homework3.Phone;

import java.util.Arrays;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String number) {
        System.out.println("Звонит кто-то");
    }

    public String getNumber() {
        return this.number;
    }

    public void receiveCall(String number, String name) {
        System.out.println("Звонит " + name);
    }

    public void sendMessage(String... number) {
        System.out.println(Arrays.toString(number));
    }
}
