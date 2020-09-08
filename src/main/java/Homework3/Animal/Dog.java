package Homework3.Animal;

public class Dog extends Animal {
    private String nickname;
    private int pawsQuantity;
    private boolean isPregnant;
    private String furLength;

    public Dog(String food, String location, String nickname, int pawsQuantity, boolean isPregnant, String furLength) {
        super(food, location);
        this.nickname = nickname;
        this.pawsQuantity = pawsQuantity;
        this.isPregnant = isPregnant;
        this.furLength = furLength;
    }

    public void makeNoise() {
        super.makeNoise();
    }

    public void eat() {
        super.eat();
    }
}