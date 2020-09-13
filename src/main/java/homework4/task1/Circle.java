package homework4.task1;

public class Circle implements Shape {
    private double r = 2.0;
    private double pi = 3.14;

    @Override
    public double square() {
        return r * r * pi;
    }
}