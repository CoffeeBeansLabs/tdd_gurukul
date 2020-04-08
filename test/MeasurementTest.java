import  org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MeasurementTest {
    @Test
    public  void  isEqualTo_shouldReturnTrue_given100CmAnd1Meter(){

        Measurement hunderedCm = new Measurement(100,Unit.CENTIMETER);
        Measurement oneMeter   =  new Measurement(1,Unit.METER);

        Boolean result = hunderedCm.isEqualTo(oneMeter);

        assertEquals(true,result);
    }

    @Test
    public  void  isEqualTo_shouldReturnTrue_given1000gmAnd1Kg(){

        Measurement thousandGram = new Measurement(1000,Unit.GRAM);
        Measurement oneKiloGram   =  new Measurement(1,Unit.KILOGRAM);

        Boolean result = thousandGram.isEqualTo(oneKiloGram);

        assertEquals(true,result);
    }

    @Test
    public  void  isEqualTo_shouldReturnTrue_given1000MeterAnd1Kilometer(){

        Measurement thousandMeter = new Measurement(1000,Unit.METER);
        Measurement oneKilometer  =  new Measurement(1,Unit.KILOMETER);

        Boolean result = thousandMeter.isEqualTo(oneKilometer);

        assertEquals(true,result);
    }

    @Test
    public  void  isEqualTo_shouldReturnFalse_given100MeterAnd1Kilometer(){

        Measurement thousandMeter = new Measurement(100,Unit.METER);
        Measurement oneKilometer   =  new Measurement(1,Unit.KILOMETER);

        Boolean result = thousandMeter.isEqualTo(oneKilometer);

        assertEquals(false,result);
    }

    @Test
    public  void  isEqualTo_shouldReturnFalse_givenMinus1000MeterAnd1Kilometer(){

        Measurement thousandMeter = new Measurement(-1000,Unit.METER);
        Measurement oneKilometer   =  new Measurement(1,Unit.KILOMETER);

        Boolean result = thousandMeter.isEqualTo(oneKilometer);

        assertEquals(false,result);
    }
}
