package Homework3.Animal;

public class Cat extends Animal {
    private String name;
    private int eyesQuantity;
    private boolean isTail;
    private String furLength;

    public Cat(String food, String location, String name, int eyesQuantity, boolean isTail, String furLength) {
        super(food, location);
        this.name = name;
        this.eyesQuantity = eyesQuantity;
        this.isTail = isTail;
        this.furLength = furLength;
    }

    public void makeNoise() {
        super.makeNoise();
    }

    public void eat() {
        super.eat();
    }
}