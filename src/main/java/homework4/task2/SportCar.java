package homework4.task2;

public class SportCar extends Car {
    private final double maxSpeed;

    public SportCar(String brand, String carClass, double weight, Engine engine, double maxSpeed) {
        super(brand, carClass, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Класс: " + carClass);
        System.out.println("Вес: " + weight);
        System.out.println("Производитель мотора: " + engine.producer);
        System.out.println("Мощность мотора: " + engine.horsePower);
        System.out.println("Максимальная скорость: " + maxSpeed);
    }
}
