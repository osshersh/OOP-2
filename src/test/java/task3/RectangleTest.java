package task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task2.Rectangle;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    task2.Rectangle rectangle = new Rectangle(4, 3);

    @Test
    void shouldReturnProperWhenIsRectangleArea() {
        double rectangleArea = rectangle.getArea();
        Assertions.assertEquals(12, rectangleArea);
    }

    @Test
    void shouldReturnProperWhenIsNotRectangleArea() {
        double rectangleArea = rectangle.getArea();
        Assertions.assertNotEquals(13, rectangleArea);
    }

    @Test
    void shouldReturnProperWhenIsRectanglePerimeter() {
        double rectanglePerimeter = rectangle.getPerimeter();
        Assertions.assertEquals(14, rectanglePerimeter);
    }

    @Test
    void shouldReturnProperWhenIsNotRectanglePerimeter() {
        double rectanglePerimeter = rectangle.getPerimeter();
        Assertions.assertNotEquals(15, rectanglePerimeter);
    }
}