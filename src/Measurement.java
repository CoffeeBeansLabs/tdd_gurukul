public class Measurement {

    private final double value;
    private final Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Boolean isEqualTo(Measurement anotherMeasure) {
        double result = anotherMeasure
                .unit.convertOneUnitToAnother(anotherMeasure.value,this.unit);
        return this.value == result;
    }
}
