public class ParkingAttendent implements ParkingObserver{
    private final int id;
    private  ParkingArea parkingArea;


    public ParkingAttendent(int id, ParkingArea parkingArea) {
        this.id = id;
        this.parkingArea = parkingArea;
    }

    public void park(Car car) throws CarAlreadyInParkingException {
        this.parkingArea.park(car);
    }

    public void unpark(Car car) throws CarNotInParkingException {
        this.parkingArea.unPark(car);
    }

    @Override
    public void notifyParkingAreaFull() {
    }

    @Override
    public void notifyParkingSpaceAvailable() {
    }
}
