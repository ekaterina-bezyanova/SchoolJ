package homework4.task2;

public class Lorry extends Car {
    private final double carryingPower;

    public Lorry(String brand, String carClass, double weight, Engine engine, double carryingPower) {
        super(brand, carClass, weight, engine);
        this.carryingPower = carryingPower;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Класс: " + carClass);
        System.out.println("Вес: " + weight);
        System.out.println("Производитель мотора: " + engine.producer);
        System.out.println("Мощность мотора: " + engine.horsePower);
        System.out.println("Грузоподъемность: " + carryingPower);
    }
}
