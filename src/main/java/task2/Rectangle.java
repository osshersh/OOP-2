package task2;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double sideA, double sideB) {
        this.width = sideA;
        this.height = sideB;

    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}
