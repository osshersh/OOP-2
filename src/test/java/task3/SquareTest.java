package task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task2.Square;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    task2.Square square = new Square(6);

    @Test
    void shouldReturnProperWhenIsAreaSquare() {
        double areaSquare = square.getArea();
        Assertions.assertEquals(36, areaSquare);
    }

    @Test
    void shouldReturnProperWhenIsNotAreaSquare() {
        double areaSquare = square.getArea();
        Assertions.assertNotEquals(37, areaSquare);
    }

    @Test
    void shouldReturnProperWhenIsPerimeterSquare() {
        double perimeterSquare = square.getPerimeter();
        Assertions.assertEquals(24, perimeterSquare);
    }

    @Test
    void shouldReturnProperWhenIsNoPerimeterSquare() {
        double perimeterSquare = square.getPerimeter();
        Assertions.assertNotEquals(25, perimeterSquare);
    }
}