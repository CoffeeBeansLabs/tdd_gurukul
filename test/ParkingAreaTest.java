import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParkingAreaTest {


    @Test
    public  void  parkingCar_shouldReturnTrue_whenTryingToPark(){

        Car car = new Car("ABC 123");
        ParkingArea parkArea = new ParkingArea();
        parkArea.park(car);

        Boolean carParked = parkArea.isCarParked(car);

        assertEquals(true, carParked);
    }


    @Test
    public  void  parkingCar_shouldReturnFalse_whenParkingAreaIsOccupied(){

        Car car = new Car("ABC 123");
        ParkingArea parkArea = new ParkingArea();
        parkArea.park(car);
        parkArea.park(car);

    }






}
