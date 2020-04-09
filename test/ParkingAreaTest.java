import org.junit.Test;



public class ParkingAreaTest {

    @Test
    public void park_shouldReturnTrue_givenCarIsNotAlreadyParked() throws InvalidOperationException {
        ParkingArea parkingArea = new ParkingArea();
        Car car = new Car();

        parkingArea.park(car);

    }

    @Test(expected = InvalidOperationException.class )
    public void park_shouldReturnFalse_givenCarIsAlreadyParked() throws InvalidOperationException {
        ParkingArea parkingArea = new ParkingArea();
        Car car = new Car();
        parkingArea.park(car);

        parkingArea.park(car);

    }

    @Test
    public void unpark_shouldReturnTrue_givenCarIsAlreadyParked() throws InvalidOperationException {
        ParkingArea parkingArea = new ParkingArea();
        Car car = new Car();

        parkingArea.park(car);

       parkingArea.unpark(car);
    }

    @Test(expected = InvalidOperationException.class )
    public void unpark_shouldReturnFalse_givenCarIsNotParked() throws InvalidOperationException {
        ParkingArea parkingArea = new ParkingArea();
        Car car = new Car();
        parkingArea.park(car);

        Car car1 = new Car();

        parkingArea.unpark(car1);
    }

    @Test
    public void park_shouldReturnTrue_multipleDifferentCarsAreNotAlreadyParked() throws InvalidOperationException {
        ParkingArea parkingArea = new ParkingArea();
        Car car = new Car();
        parkingArea.park(car);
        Car car1 = new Car();
        parkingArea.park(car1);
        Car car2 = new Car();
        parkingArea.park(car2);
        parkingArea.unpark(car1);
        parkingArea.unpark(car);


        Car car4 = new Car();

        parkingArea.park(car4);

    }

}
