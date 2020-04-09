import java.util.Objects;

public class Measurement {

    private final double value;
    private final Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Boolean isEqualTo(Measurement anotherMeasure) throws InvalidUnitComparisonException {
        int result = this
                .unit.convertOneUnitToAnother(this.value,anotherMeasure.unit);
        return anotherMeasure.value == result;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement that = (Measurement) o;
        try {
            return this.isEqualTo(that);
        } catch (InvalidUnitComparisonException e) {
            e.printStackTrace();
        }
        return false;
    }

}
