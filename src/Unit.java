public  enum Unit{

    CENTIMETER(100),METER(1),KILOGRAM(1),GRAM(1000);

    private int unitFactor;

    Unit(int factor){
        unitFactor = factor;
    }

    public int convertToCentimeter(int value) {
        return value * 100;
    }

    public int convertOneUnitToAnother(int value ,Unit unit1, Unit unit2) {
        if (unit1 == METER  && unit2==CENTIMETER){
            return value * CENTIMETER.unitFactor;
        }else if (unit1 == CENTIMETER  && unit2==METER){
            return value/METER.unitFactor;
        }else if (unit1 == KILOGRAM  && unit2==GRAM){
            return value * GRAM.unitFactor;
        }else if (unit1 == GRAM  && unit2==KILOGRAM){
            return value/KILOGRAM.unitFactor;
        }

        return -1;
    }
}