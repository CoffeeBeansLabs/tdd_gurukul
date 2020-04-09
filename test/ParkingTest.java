import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingTest {
    @Test
     public  void park_shouldReturnTrue_givenCarObject(){
        Car car = new Car("1234","Sedan");
        Parking parking = new Parking();

        parking.park(car);
        Boolean result  = parking.isCarAlreadyParked(car);
        assertTrue(result);
    }

    @Test
    public  void isCarAlreadyParked_shouldReturnFalse_givenCarObject(){
        Car car = new Car("1234","Sedan");
        Parking parking = new Parking();

        Boolean result  = parking.isCarAlreadyParked(car);

        assertFalse(result);
    }

    @Test
    public  void parkAndunparkAndCheckIfCarAlreadyParked_shouldReturnFalse_givenCarToUnpark(){
        Car car = new Car("1234","Sedan");
        Parking parking = new Parking();

        parking.park(car);
        parking.unPark(car);

        Boolean status =  parking.isCarAlreadyParked(car);

        assertFalse(status);
    }

    @Test
    public  void parkMultipleCarsAndunparkAndCheckIfCarAlreadyParked_shouldReturnFalse_givenCarToUnpark(){
        Parking parking = new Parking();
        Car car1 = new Car("1234","Sedan");
        Car car2 = new Car("5678","SUV");

        parking.park(car1);
        parking.park(car2);

        parking.unPark(car2);

        Boolean status1 =  parking.isCarAlreadyParked(car1);
        assertTrue(status1);

        Boolean status2 = parking.isCarAlreadyParked(car2);
        assertFalse(status2);
    }
}
