import java.util.ArrayList;

public class ParkingArea {
    private final int capacity;
    private final ParkingOwner owner;

    ArrayList<Car> carList = new ArrayList<Car>();

    public ParkingArea(int capacity, ParkingOwner owner) {
        this.capacity = capacity;
        this.owner    = owner;
    }

    public Boolean isCarAlreadyParked(Car car){
        return this.carList.contains(car);
    }

    private boolean checkIfParkingFull() {
        return this.capacity == this.carList.size();
    }

    public void park(Car car) throws carAlreadyInParkingException {
        if(isCarAlreadyParked(car)) {
            throw new carAlreadyInParkingException("Car already parked");
        }
        this.carList.add(car);
        if(this.checkIfParkingFull()){
            this.owner.notifyParkingAreaFull();
        }
    }


    public void unPark(Car car) throws  carNotInParkingException {
        boolean parkingFullStatus = this.checkIfParkingFull();

        if(isCarAlreadyParked(car) == false) {
            throw new carNotInParkingException("Car not in parking");
        }

        this.carList.remove(car);
        if(parkingFullStatus){
            this.owner.notifyParkingSpaceAvailable();
        }
    }
}
