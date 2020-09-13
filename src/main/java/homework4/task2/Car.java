package homework4.task2;

public abstract class Car {
    protected String brand;
    protected String carClass;
    protected double weight;
    protected final Engine engine;

    public Car(String brand, String carClass, double weight, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    protected abstract void start();

    protected abstract void stop();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public abstract void printInfo();
}