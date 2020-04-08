public enum Unit {
    Meter(0.01), Centimeter(1), KILOMETER(0.00001), GM(1), KILOGRAM(0.001);

    double factor;

    Unit(double factor) {
        this.factor = factor;
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