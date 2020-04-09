public  enum Unit{

    CENTIMETER(1),METER(0.01),KILOMETER(0.00001),GRAM(1),KILOGRAM(0.001);

    private double unitFactor;

    Unit(double factor){
        unitFactor = factor;
    }

    public static void validateComparison(Measurement m1, Measurement m2) {



    }

    public int convertOneUnitToAnother(double value ,Unit anotherUnit) {
        return (int) ((value * anotherUnit.unitFactor)/this.unitFactor);
    }

    public int convertToCentimeter(int value) {
        return 0;
    }
}