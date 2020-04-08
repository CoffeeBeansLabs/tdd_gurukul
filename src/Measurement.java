public class Measurement {

    private final int value;
    private final Unit unit;

    public Measurement(int value, Unit unit) {

        this.value = value;
        this.unit = unit;
    }

    public boolean isEqualTo(Measurement measurement) {
        System.out.println(measurement.unit.convertOneUnitToAnother(measurement.value, this.unit.factor));
        System.out.println((double)this.value);
        System.out.println(this.unit);
        System.out.println(measurement.unit);
        return (double)(this.value) == (double) measurement.unit.convertOneUnitToAnother(measurement.value, this.unit.factor);
    }
}
