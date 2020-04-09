import java.util.ArrayList;

public class Parking {
    ArrayList<Car> carList = new ArrayList<Car>();

    public Boolean isCarAlreadyParked(Car car){
        return this.carList.contains(car);
    }

    public void park(Car car) {
        this.carList.add(car);
    }

    public void unPark(Car car){
        this.carList.remove(car);
    }
}
