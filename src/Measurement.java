public class Measurement {

    private final double value;
    private final Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Boolean isEqualTo(Measurement anotherMeasure) {
        int result = this
                .unit.convertOneUnitToAnother(this.value,anotherMeasure.unit);
        return anotherMeasure.value == result;
    }
}
