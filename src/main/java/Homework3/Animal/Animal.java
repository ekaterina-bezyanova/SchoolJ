package Homework3.Animal;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Такое-то животное спит");
    }

    public void eat() {
        System.out.println("Хрум-хрум");
    }

    public void sleep() {
        System.out.println("Zzzzzz...");
    }
}
