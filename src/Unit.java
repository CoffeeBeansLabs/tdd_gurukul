public  enum Unit{

    CENTIMETER(1,UnitType.DISTANCE),METER(0.01, UnitType.DISTANCE),KILOMETER(0.00001, UnitType.DISTANCE),GRAM(1, UnitType.WEIGHT),KILOGRAM(0.001, UnitType.WEIGHT);

    private double unitFactor;
    private UnitType unitType;


    Unit(double factor,  UnitType unitType){
        unitFactor = factor;
        this.unitType = unitType;
    }

    public int convertOneUnitToAnother(double value ,Unit anotherUnit) throws InvalidUnitComparisonException {

        if (this.unitType == anotherUnit.unitType) {
            return (int) ((value * anotherUnit.unitFactor) / this.unitFactor);
        }

        throw new InvalidUnitComparisonException("Invalid unit comparision");
    }
}