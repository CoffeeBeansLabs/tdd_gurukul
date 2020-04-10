import Car.Car;
import java.util.ArrayList;
public class ParkingArea {
    ArrayList<Car> carList = new ArrayList<Car>();
    int capacity;

    private Owner parkingOwner;
    ParkingArea(int capacity, Owner parkingOwner) {
        this.capacity = capacity;
        this.parkingOwner=parkingOwner;
    }

    public Boolean ownerNotify() {
        if (carList.size() == capacity) {
            parkingOwner.notifyOwnerWhenParkingFull(true);
        }
        else parkingOwner.notifyOwnerWhenParkingFull(false);
        return true;
    }
    public Boolean ownerNotifyFreeSpace() {
        if (carList.size() < capacity) {
            parkingOwner.notifyOwner(true);
        } else {
            parkingOwner.notifyOwner(false);
        }
        return true;
    }
    public void park(Car car){
        if(capacity>carList.size()){
            carList.add(car);
        }


    }

}

