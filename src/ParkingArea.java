import java.util.HashMap;

public class ParkingArea {

    int parkingCapacity;
    String parkingId;

    ParkingArea(String parkingId){
        this.parkingId = parkingId;
    }

    private boolean parkingAreaState = true;

    HashMap<String, String> parkedCarList = new HashMap<>();


    public void park(Car car){
//        command
        parkedCarList.put(car.carNumber, parkingId);
    }


    public boolean isCarParked(Car car) {
//        query
        if (parkedCarList.containsKey(car.carNumber)){
            return true;
        }
        return false;
    }



    public String unPark(Car car) {
        return parkedCarList.remove(car.carNumber);


    }



}


