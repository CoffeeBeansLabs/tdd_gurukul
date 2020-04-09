import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParkingAreaTest {

    @Test
    public  void  parkingCar_shouldReturnTrue_whenTryingToPark(){

        Car car = new Car("ABC 123");

        ParkingArea parkArea = new ParkingArea();

        Boolean result = parkArea.park(car);

        assertEquals(true, result);
    }
}
