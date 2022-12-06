package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle = new Circle(3);

    @Test
    void shouldReturnProperWhenIsAreaCircle() {
        double area = circle.getArea();
        Assertions.assertEquals(28.26,area);
    }

    @Test
    void shouldReturnProperWhenIsNotAreaCircle(){
        double area = circle.getArea();
        Assertions.assertNotEquals(29,area);
    }

    @Test
    void shouldReturnProperWhenIsCircumference() {
        double circumference = circle.getPerimeter();
        Assertions.assertEquals(18.84,circumference);
    }

    @Test
    void shouldReturnProperWhenIsNotCircumference(){
        double circumference = circle.getPerimeter();
        Assertions.assertNotEquals(18,circumference);
    }
}