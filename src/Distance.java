public class Distance {

    private final int value;
    private final Unit unit;

    public Distance(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Boolean isEqualTo(Distance anotherDistance) {
        int result = anotherDistance.unit.convertToCentimeter(anotherDistance.value);
        return this.value == result;
    }
}
