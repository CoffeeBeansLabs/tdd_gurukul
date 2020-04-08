public  enum Unit{

    CENTIMETER(1),METER(0.01),KILOMETER(0.00001),GRAM(1),KILOGRAM(0.001);

    private double unitFactor;

    Unit(double factor){
        unitFactor = factor;
    }

    public double convertOneUnitToAnother(double value ,Unit anotherUnit) {
        return  Math.ceil((value * anotherUnit.unitFactor)/this.unitFactor);
    }
}