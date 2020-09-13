package homework4.task1;

public class Rectangle implements Shape {
    private double length = 5.0;
    private double width = 3.3;

    @Override
    public double square() {
        return length * width;
    }
}
