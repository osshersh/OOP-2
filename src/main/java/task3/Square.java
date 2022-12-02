package task3;

public class Square implements Calculation {
    private double sideSquare;

    public Square(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    @Override
    public double getPerimeter() {
        return sideSquare * 4;
    }

    @Override
    public double getArea() {
        return sideSquare * sideSquare;
    }
}
