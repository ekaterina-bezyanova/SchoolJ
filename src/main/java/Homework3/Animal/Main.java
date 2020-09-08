package Homework3.Animal;

public class Main {
    public static void main(String[] args) {
        Veterinarian vet = new Veterinarian();
        Cat cat = new Cat("milk", "Moscow", "Fluffy", 2, true, "no");
        Dog dog = new Dog("meat", "SPB", "Lucky", 3, false, "long");
        Horse horse = new Horse("carrot", "Kostroma", "Charm", 4, true, "Mustang");
        Animal[] animals = new Animal[]{cat, dog, horse};

        for (int i = 0; i < animals.length; ++i) {
            vet.treatAnimal(animals[i]);
        }
    }
}
