import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test

    public  void  area_return0_givenNegativeLengthAndNegativeBreadth(){
        Rectangle rectangle = Rectangle.createRectangle(-2.0f,-3.0f);
        Float area = rectangle.area();

        assertEquals(0.0f,area,0.0);
    }

    @Test
    public  void  area_return20_given10LengthAnd2Breadth(){
        Rectangle rectangle = Rectangle.createRectangle(10.0f,2.0f);
        Float area = rectangle.area();

        assertEquals(20.0f,area,0.0);
    }

    @Test
    public  void  perimeter_return0_givenNegativeLengthAndNegativeBreadth(){
        Rectangle rectangle = Rectangle.createRectangle(-10.0f,-2.0f);
        Float area = rectangle.perimeter();

        assertEquals(0.0f,area,0.0);
    }

    @Test
    public  void  perimeter_return24_given10LengthAnd2Breadth(){
        Rectangle rectangle = Rectangle.createRectangle(10.0f,2.0f);
        Float perimeter = rectangle.perimeter();

        assertEquals(24.0f,perimeter,0.0);
    }

    @Test
    public  void  perimeter_return40_givenSideIs10(){
        Rectangle rectangle = Rectangle.createSquare(10.0f);
        Float perimeter = rectangle.perimeter();

        assertEquals(40.0f,perimeter,0.0);
    }

    @Test
    public  void  area_return100_givenSideIs10(){
        Rectangle rectangle = Rectangle.createSquare(10.0f);
        Float area = rectangle.area();

        assertEquals(100.0f,area,0.0);
    }
}
