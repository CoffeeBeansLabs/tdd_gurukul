import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkingTest {

    @Test
    public void parking_shoulReturnTrue_CanParkIsTrue() {
        Parking parking = new Parking();
        Car car = new Car();

        boolean canPark = parking.canPark(car);

        assertEquals(true, canPark);
    }

    @Test
    public void parking_shoulReturnFalse_CanParkIsFalse() {


    }

}
