package task2;

public class Square extends Rectangle {
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public double getPerimeter() {
        return sideA * 4;
    }
}
