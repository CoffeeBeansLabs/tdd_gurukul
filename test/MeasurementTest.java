import  org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MeasurementTest {
    @Test
    public  void  isEqualTo_shouldReturnTrue_given100CmAnd1Meter(){

        Measurement hunderedCm = new Measurement(100,Unit.CENTIMETER);
        Measurement oneMeter   =  new Measurement(1,Unit.METER);

        assertEquals(hunderedCm,oneMeter);
    }


    @Test
    public  void  isEqualTo_shouldReturnTrue_given1000gmAnd1Kg(){

        Measurement thousandGram = new Measurement(1000,Unit.GRAM);
        Measurement oneKiloGram   =  new Measurement(1,Unit.KILOGRAM);

        assertEquals(thousandGram,oneKiloGram);
    }

    @Test
    public  void  isEqualTo_shouldReturnTrue_given1000MeterAnd1Kilometer(){

        Measurement thousandMeter = new Measurement(1000,Unit.METER);
        Measurement oneKilometer  =  new Measurement(1,Unit.KILOMETER);

        assertEquals(thousandMeter,oneKilometer);
    }

    @Test
    public  void  isEqualTo_shouldReturnFalse_given100MeterAnd1Kilometer(){

        Measurement hundredMeter = new Measurement(100,Unit.METER);
        Measurement oneKilometer   =  new Measurement(1,Unit.KILOMETER);

        assertEquals(hundredMeter,oneKilometer);
    }

    @Test
    public  void  isEqualTo_shouldReturnFalse_givenMinus1000MeterAnd1Kilometer(){

        Measurement thousandMeter = new Measurement(-1000,Unit.METER);
        Measurement oneKilometer   =  new Measurement(1,Unit.KILOMETER);

        assertEquals(thousandMeter,oneKilometer);
    }

    @Test
    public  void  isEqualTo_shouldReturnException_given1GramAnd1Centimeter(){


        Measurement oneGram = new Measurement(1,Unit.GRAM);
        Measurement oneCentimeter   =  new Measurement(1,Unit.CENTIMETER);

        try{
            oneGram.isEqualTo(oneCentimeter);
        }
        catch(InvalidUnitType invalidUnitType){
            System.out.println(invalidUnitType);
        }



    }






}