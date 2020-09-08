package Homework3.Animal;

public class Horse extends Animal {
    private String surname;
    private int legsQuantity;
    private boolean isRace;
    private String breed;

    public Horse(String food, String location, String surname, int legsQuantity, boolean isRace, String breed) {
        super(food, location);
        this.surname = surname;
        this.legsQuantity = legsQuantity;
        this.isRace = isRace;
        this.breed = breed;
    }

    public void makeNoise() {
        super.makeNoise();
    }

    public void eat() {
        super.eat();
    }
}