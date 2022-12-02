package task2;

public class Circle extends Shape {
    private static final double PI = 3.14;
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        return PI * 2 * radius;
    }
}
