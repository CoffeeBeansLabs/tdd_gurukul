import com.company.ParkingArea;

public class ParkingOwner {
    private int capacity;
    private ParkingArea parkingArea;

    public ParkingOwner(int capacity, ParkingArea parkingArea) {
        this.capacity = capacity;
        this.parkingArea = parkingArea;
    }

    public boolean getNotification() {

        return parkingArea.checkParkingAreaStatus(capacity);
    }
}
