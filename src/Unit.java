public enum Unit {
    Meter(0.01, UnitType.DISTANCE), Centimeter(1,  UnitType.DISTANCE), KILOMETER(0.00001,  UnitType.DISTANCE), GM(1,  UnitType.WEIGHT), KILOGRAM(0.001,  UnitType.DISTANCE);

    double factor;
    private UnitType unitType;

    Unit(double factor, UnitType unitType) {
        this.factor = factor;
        this.unitType = unitType;
    }

    public UnitType getUnitType() {
        return unitType;
    }
//
//    public float getCentimterUnitFactor(int value) {
//       return (value * Centimeter.factor)/Meter.factor; // 1
//    }
//
//    public float getMeterUnitFactor(int value) { //1cm
//        return (value * Meter.factor)/Centimeter.factor;  // 1*1/100=0.01
//    }

    public double convertOneUnitToAnother(int value, double unitFactor) { // 100 cm
        return value * (unitFactor / this.factor); // 100 * 0.01
    }
}

// (this.value* that.factor)/this.factor