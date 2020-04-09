import java.util.Objects;

public class Measurement {

    private final double value;
    private final Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Boolean isEqualTo(Measurement anotherMeasure) throws InvalidUnitType {
        int result = anotherMeasure.unit.convertOneUnitToAnother(anotherMeasure.value, this.unit);
        return this.value == result;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Measurement that = (Measurement) o;
////        return this.isEqualTo(that);
//    }

}