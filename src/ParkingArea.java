import java.util.HashSet;
import java.util.Set;


public class ParkingArea {

    private Set<Car> cars = new HashSet<Car>();


    public void park(Car car) throws InvalidOperationException {
        if (this.cars.contains(car)) {
            throw  new InvalidOperationException();
        }
        this.cars.add(car);
    }

    public void unpark(Car car) throws InvalidOperationException {
        if (!this.cars.contains(car)) {
            throw new InvalidOperationException();
        }
        this.cars.remove(car);
    }
}




