package Task2;

public class Main {
    public static void main(String[] args) {

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        Box box = new Box();
        Box otherBox = new Box();
        Box anotherBox = new Box();

        box.add(apple1);
        box.add(orange1);
        box.add(apple2);
        System.out.println("Вес коробки: " + box.getWeight());

        otherBox.add(orange1);
        otherBox.add(orange2);
        otherBox.add(apple1);
        System.out.println("Вес коробки: " + otherBox.getWeight());

        System.out.println("Равны ли коробки по весу? " + box.compare(otherBox));
        box.relocate(otherBox);

        anotherBox.add(orange3);
        anotherBox.add(orange4);

        System.out.println("Равны ли коробки по весу? " + otherBox.compare(anotherBox));
        otherBox.relocate(anotherBox);
    }
}
