package Homework3.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("9271234567", "Model1", 1.023D);
        Phone phone2 = new Phone("9271234568", "Model2", 1.561D);
        Phone phone3 = new Phone("9271234569", "Model3", 1.854D);

        System.out.println("Номер " + phone1.number + ", модель " + phone1.model + ", вес " + phone1.weight);
        System.out.println("Номер " + phone2.number + ", модель " + phone2.model + ", вес " + phone2.weight);
        System.out.println("Номер " + phone3.number + ", модель " + phone3.model + ", вес " + phone3.weight);

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        phone1.receiveCall("9051234567");
        phone2.receiveCall("9051234568");
        phone3.receiveCall("9051234569");

        phone1.receiveCall("9021234567", "Alice");
        phone2.receiveCall("9021234568", "Bob");
        phone3.receiveCall("9021234569", "Carol");

        phone1.sendMessage("9051234567");
        phone2.sendMessage("9051234568", "9051234569");
        phone3.sendMessage("9271234567", "9271234568", "9271234569");
    }
}
