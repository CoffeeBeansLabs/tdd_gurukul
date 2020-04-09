import com.company.InvalidUnitTypeException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Measurement {

    private final int value;
    private final Unit unit;

    public Measurement(int value, Unit unit) {

        this.value = value;
        this.unit = unit;
    }

    public boolean isEqualTo(Measurement measurement) throws Exception {

        HashMap<Unit, UnitType> map = new HashMap<>();
        map.put(Unit.Centimeter, UnitType.DISTANCE);
        map.put(Unit.Meter, UnitType.DISTANCE);
        map.put(Unit.KILOMETER, UnitType.DISTANCE);
        map.put(Unit.GM, UnitType.WEIGHT);
        map.put(Unit.KILOGRAM, UnitType.WEIGHT);

        if((this.unit.getUnitType().equals(UnitType.DISTANCE) && measurement.unit.getUnitType().equals(UnitType.WEIGHT)) || (this.unit.getUnitType().equals(UnitType.WEIGHT) && measurement.unit.getUnitType().equals(UnitType.DISTANCE)))
        {
            throw new InvalidUnitTypeException("Invalid unit Type Exception");
        }

//        if((lengthList.contains(this.unit) && weightList.contains(measurement.unit)) || (lengthList.contains(measurement.unit) && weightList.contains(this.unit))) {
//            throw new Error("Invalid unit parameter");
//        }
        return (double)(this.value) == (double) measurement.unit.convertOneUnitToAnother(measurement.value, this.unit.factor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement that = (Measurement) o;
        try {
            return this.isEqualTo(that);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  false;
    }
}
