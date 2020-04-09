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

    @Test(expected = InvalidUnitComparisonException.class )
//    @Test
    public  void  isEqualTo_shouldThrowInvalidUnitComparisonException_given1CentimeterAnd1gram() throws InvalidUnitComparisonException {

        Measurement oneCentimeter = new Measurement(1,Unit.CENTIMETER);
        Measurement oneGram   =  new Measurement(1,Unit.GRAM);
        oneCentimeter.isEqualTo(oneGram);

    }

    @Test
    public  void  isEqualTo_shouldReturnFalse_given1CentimeterAnd1Centimeter() throws InvalidUnitComparisonException {

        Measurement oneCentimeter = new Measurement(1,Unit.CENTIMETER);
        Measurement oneGram   =  new Measurement(1,Unit.CENTIMETER);
        Boolean result = false;
        try{
            result = oneCentimeter.isEqualTo(oneGram);
        }catch (InvalidUnitComparisonException ex){
            throw  ex;
        }

        assertEquals(true,result);
    }
}
