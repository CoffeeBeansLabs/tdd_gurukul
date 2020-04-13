import java.util.ArrayList;
import java.util.List;

public class ParkingArea {
    private final int capacity;

    ArrayList<Car> carList = new ArrayList<Car>();
    List<ParkingObserver> parkingObservers = new ArrayList<>();

    public void addObserver(ParkingObserver parkingObserver) {
        this.parkingObservers.add(parkingObserver);
    }

    public void removeObserver(ParkingObserver parkingObserver) {
        this.parkingObservers.remove(parkingObserver);
    }

    public ParkingArea(int capacity) {
        this.capacity = capacity;
    }

    public Boolean isCarAlreadyParked(Car car){
        return this.carList.contains(car);
    }

    private boolean checkIfParkingFull() {
        return this.capacity == this.carList.size();
    }

    public void park(Car car) throws CarAlreadyInParkingException {
        if(isCarAlreadyParked(car)) {
            throw new CarAlreadyInParkingException("Car already parked");
        }
        this.carList.add(car);
        if(this.checkIfParkingFull()){
            this.notifyParkingAreaFull();
        }
    }

    private void notifyParkingAreaFull() {
        for(ParkingObserver parkingObserver: this.parkingObservers){
            parkingObserver.notifyParkingAreaFull();
        }
    }

    private void notifyParkingSpaceAvailable() {
        for(ParkingObserver parkingObserver: this.parkingObservers){
            parkingObserver.notifyParkingSpaceAvailable();
        }
    }

    public void unPark(Car car) throws CarNotInParkingException {
        boolean parkingFullStatus = this.checkIfParkingFull();

        if(isCarAlreadyParked(car) == false) {
            throw new CarNotInParkingException("Car not in parking");
        }

        this.carList.remove(car);
        if(parkingFullStatus){
            this.notifyParkingSpaceAvailable();
        }
    }
}
