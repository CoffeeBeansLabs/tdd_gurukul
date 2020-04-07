public  enum Unit{
    CENTIMETER(100),METER(1);
    private int unitFactor;
    Unit(int factor){
        unitFactor = factor;
    }

    public int convertToCentimeter(int value) {
        return value * 100;
    }
}