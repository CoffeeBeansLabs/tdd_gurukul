//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public  class RectangleTest {
//
//    @Test
//    public void calculateArea_shouldReturn55_whenLengthIs11AndBreadthIs5() {
//
//        Rectangle rectangle = Rectangle.createRectangle(10,4);
//
//        float area = rectangle.area();
//
//        assertEquals(55.0, area, 0.0);
//
//    }
//
//    @Test
//    public void calculateArea_shouldReturn0_whenLengthOrBreadthIsNegative() {
//        Rectangle rectangle = new Rectangle(-11,18);
//
//        float area = rectangle.area();
//
//        assertEquals(0, area, 0.0);
//    }
//
//    @Test
//    public void calculatePerimeter_shouldReturn30_whenLengthIs10AndBreadthIs5() {
//        Rectangle rectangle = new Rectangle(10,5);
//
//        float perimeter = rectangle.perimeter();
//
//        assertEquals(30, perimeter, 0.0);
//    }
//
//}