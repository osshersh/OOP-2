package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle = new Triangle(3,4,5);

    @Test
    void shouldReturnProperWhenIsTriangleArea() {
     double triangleArea = triangle.getArea();
     Assertions.assertEquals(6,triangleArea);
    }

    @Test
    void shouldReturnProperWhenIsNotTriangleArea(){
        double triangleArea = triangle.getArea();
        Assertions.assertNotEquals(7,triangleArea);
    }

    @Test
    void shouldReturnProperWhenIsTrianglePerimeter() {
        double trianglePerimeter = triangle.getPerimeter();
        Assertions.assertEquals(12,trianglePerimeter);

    }

    @Test
    void  shouldReturnProperWhenIsNotTrianglePerimeter(){
        double trianglePerimeter = triangle.getPerimeter();
        Assertions.assertNotEquals(13,trianglePerimeter);

    }
}