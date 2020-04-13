import com.sun.org.glassfish.gmbal.ManagedOperation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ParkingAreaTest {
    @Mock
    ParkingOwner ownerMock;

    @Test
     public  void park_shouldReturnTrue_givenCarObject() throws CarAlreadyInParkingException {
        ParkingOwner owner  = new ParkingOwner();
        Car car = new Car("1234","Sedan");
        ParkingArea parking = new ParkingArea(1);
        try{
            parking.park(car);
        }catch (CarAlreadyInParkingException ex){
            throw ex;
        }
    }

    @Test(expected = CarAlreadyInParkingException.class)
    public  void isCarAlreadyParked_shouldReturnFalse_givenCarObject() throws CarAlreadyInParkingException {
        ParkingOwner owner  = new ParkingOwner();
        Car car = new Car("1234","Sedan");
        ParkingArea parking = new ParkingArea(1);

        parking.park(car);
        parking.park(car);
    }

    @Test(expected = CarNotInParkingException.class)
    public  void parkAndunparkAndCheckIfCarAlreadyParked_shouldReturnFalse_givenCarToUnpark() throws CarNotInParkingException {
        ParkingOwner owner  = new ParkingOwner();
        Car car = new Car("1234","Sedan");
        ParkingArea parking = new ParkingArea(1);
        parking.unPark(car);
    }

    @Test
    public  void parkMultipleCarsAndunparkAndCheckIfCarAlreadyParked_shouldReturnFalse_givenCarToUnpark() throws CarAlreadyInParkingException, CarNotInParkingException {
        ParkingOwner owner  = new ParkingOwner();

        ParkingArea parking = new ParkingArea(1);

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


    @Test
    public  void ownerGetNotification_shouldCallNotifyParkingAreaFull_givenParkingWithCapacity1AndParking1Cars() throws CarAlreadyInParkingException {

        ParkingArea parking     = new ParkingArea(1);
        parking.addObserver(ownerMock);

        Car car1 = new Car("1234","Sedan");
        parking.park(car1);
        verify(ownerMock).notifyParkingAreaFull();
    }

    @Test
    public  void ownerGetNotification_shouldCallNotifyParkingSpaceAvailable_givenParkingWithCapacity2AndParking2Cars() throws CarAlreadyInParkingException, CarNotInParkingException {

        ParkingArea parking     = new ParkingArea(2);
        parking.addObserver(ownerMock);

        Car car1 = new Car("1234","Sedan");
        Car car2 = new Car("5678","SUV");

        parking.park(car1);
        parking.park(car2);

        parking.unPark(car1);
        verify(ownerMock).notifyParkingSpaceAvailable();
    }

    @Test
    public  void ownerGetNotification_shouldNeverCallNotifyParkingSpaceAvailable_givenParkingWithCapacity2AndParking1Cars() throws CarAlreadyInParkingException, CarNotInParkingException {

        ParkingArea parking     = new ParkingArea(2);
        Car car1 = new Car("1234","Sedan");

        parking.addObserver(ownerMock);
        parking.park(car1);
        parking.unPark(car1);
        verify(ownerMock,never()).notifyParkingSpaceAvailable();
    }



    @Test
    public  void attendentPark_shouldPark_givenParkingAndParking1Cars() throws CarAlreadyInParkingException, CarNotInParkingException {

        ParkingArea parking     = new ParkingArea(2);

        ParkingAttendent att = new ParkingAttendent(1,parking);


        Car car1 = new Car("1234","Sedan");

        att.park(car1);

    }

    @Test
    public  void attendentunPark_shouldunPark_givenParkingAndParking1Cars() throws CarAlreadyInParkingException, CarNotInParkingException {

        ParkingArea parking     = new ParkingArea(2);

        ParkingAttendent att = new ParkingAttendent(1,parking);


        Car car1 = new Car("1234","Sedan");

        att.park(car1);
        att.unpark(car1);
    }

    @Test(expected = CarNotInParkingException.class)
    public  void attendentunPark_shouldunThrow_givenParkingAndParking1Cars() throws  CarNotInParkingException {

        ParkingArea parking     = new ParkingArea(2);

        ParkingAttendent att = new ParkingAttendent(1,parking);


        Car car1 = new Car("1234","Sedan");


        att.unpark(car1);
    }

    @Mock
    ParkingAttendent attMock;

    @Test
    public  void attendentGetNotification_shouldCallNotifyParkingFull_givenParkingWithCapacity1AndParking1Cars() throws CarAlreadyInParkingException {

        ParkingArea parking     = new ParkingArea(1);

        Car car1 = new Car("1234","Sedan");

        parking.addObserver(attMock);
        parking.addObserver(ownerMock);

        parking.park(car1);

        verify(ownerMock).notifyParkingAreaFull();
        verify(attMock).notifyParkingAreaFull();
    }
}
