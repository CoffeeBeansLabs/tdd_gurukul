public class ParkingArea {

    private boolean parkingAreaState = true;



    public void park(Car car){

        parkingAreaState = false;

    }


    public boolean isCarParked(Car car) {
       return parkingAreaState;



    }
}
