import org.junit.Test;
import Car.*;

import static org.junit.Assert.assertEquals;

public class ParkingAreaTest {
    @Test
    public void notify_owner_whenParkingLordIsfull_ShouldReturnTrue(){
        Owner owner=new Owner();
        Car car = new Car("abc1234","sedan");
        ParkingArea parkingArea=new ParkingArea(1,owner);

        parkingArea.park(car);
       Boolean notified= parkingArea.ownerNotify();
        assertEquals(true,notified);
    }
    @Test
    public void notify_owner_whenParkingLotIsfree_ShouldReturnTrue(){
        Owner owner=new Owner();
        Car car = new Car("abc1234","sedan");
        ParkingArea parkingArea=new ParkingArea(5,owner);

        parkingArea.park(car);
       Boolean notifiedTheOwner= parkingArea.ownerNotifyFreeSpace();
        assertEquals(true,notifiedTheOwner);
    }
}
