public class Measurement {

    private final int value;
    private final Unit unit;

    public Measurement(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Boolean isEqualTo(Measurement anotherMeasure) {
        int result = anotherMeasure.unit.convertOneUnitToAnother(anotherMeasure.value,anotherMeasure
                .unit,this.unit);
        return this.value == result;
    }
}
