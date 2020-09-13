package homework4.task1;

public class Triangle implements Shape {
    private double baseOfTriangle = 4.0;
    private double altitude = 2.0;

    @Override
    public double square() {
        return 0.5 * baseOfTriangle * altitude;
    }
}
