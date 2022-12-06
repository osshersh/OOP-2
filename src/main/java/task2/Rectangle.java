package task2;

import task3.Square;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double sideA, double sideB) {
        this.width = sideA;
        this.height = sideB;
    }

    public Rectangle() {
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
