import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ParkingAreaTest {


    @Test
     public  void park_shouldReturnTrue_givenCarObject() throws carAlreadyInParkingException {
        ParkingOwner owner  = new ParkingOwner();
        Car car = new Car("1234","Sedan");
        ParkingArea parking = new ParkingArea(1,owner);
        try{
            parking.park(car);
        }catch (carAlreadyInParkingException ex){
            throw ex;
        }
    }

    @Test(expected = carAlreadyInParkingException.class)
    public  void isCarAlreadyParked_shouldReturnFalse_givenCarObject() throws carAlreadyInParkingException {
        ParkingOwner owner  = new ParkingOwner();
        Car car = new Car("1234","Sedan");
        ParkingArea parking = new ParkingArea(1,owner);

        parking.park(car);
        parking.park(car);
    }

    @Test(expected = carNotInParkingException.class)
    public  void parkAndunparkAndCheckIfCarAlreadyParked_shouldReturnFalse_givenCarToUnpark() throws  carNotInParkingException {
        ParkingOwner owner  = new ParkingOwner();
        Car car = new Car("1234","Sedan");
        ParkingArea parking = new ParkingArea(1,owner);
        parking.unPark(car);
    }

    @Test
    public  void parkMultipleCarsAndunparkAndCheckIfCarAlreadyParked_shouldReturnFalse_givenCarToUnpark() throws carAlreadyInParkingException, carNotInParkingException {
        ParkingOwner owner  = new ParkingOwner();

        ParkingArea parking = new ParkingArea(1,owner);

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

    @Mock
    ParkingOwner ownerMock;

    @Test
    public  void ownerGetNotification_shouldCallNotifyParkingAreaFull_givenParkingWithCapacity1AndParking1Cars() throws carAlreadyInParkingException {

        ParkingArea parking     = new ParkingArea(1,ownerMock);

        Car car1 = new Car("1234","Sedan");
        parking.park(car1);
        verify(ownerMock).notifyParkingAreaFull();
    }

    @Test
    public  void ownerGetNotification_shouldCallNotifyParkingSpaceAvailable_givenParkingWithCapacity2AndParking2Cars() throws carAlreadyInParkingException, carNotInParkingException {

        ParkingArea parking     = new ParkingArea(2,ownerMock);

        Car car1 = new Car("1234","Sedan");
        Car car2 = new Car("5678","SUV");

        parking.park(car1);
        parking.park(car2);

        parking.unPark(car1);
        verify(ownerMock).notifyParkingSpaceAvailable();
    }

    @Test
    public  void ownerGetNotification_shouldNeverCallNotifyParkingSpaceAvailable_givenParkingWithCapacity2AndParking1Cars() throws carAlreadyInParkingException, carNotInParkingException {

        ParkingArea parking     = new ParkingArea(2,ownerMock);
        Car car1 = new Car("1234","Sedan");
        parking.park(car1);
        parking.unPark(car1);
        verify(ownerMock,never()).notifyParkingSpaceAvailable();
    }
}

