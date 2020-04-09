import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeasurementTest {

    @Test
    public void distance_shouldReturnTrue_WhenCentimeterIs100AndMeterIs1() throws Exception {

        Measurement hundredCentimeter = new Measurement(100, Unit.Centimeter);
        Measurement oneMeter = new Measurement(1, Unit.Meter);

        boolean result = oneMeter.isEqualTo(hundredCentimeter);

        assertEquals(result, true);
    }

    @Test
    public void distance_shouldReturnFalse_WhenCentimeterIs10AndMeterIs1() throws Exception {

        Measurement hundredCentimeter = new Measurement(10, Unit.Centimeter);
        Measurement oneMeter = new Measurement(1, Unit.Meter);

        boolean result = oneMeter.isEqualTo(hundredCentimeter);

        assertEquals(result, false);
    }

    @Test
    public void distance_shouldReturnTrue_WhenKilometerIs1AndMeterIs1000() throws Exception {

        Measurement oneKilometer = new Measurement(1, Unit.KILOMETER);
        Measurement thousandMeter = new Measurement(1000, Unit.Meter);

        boolean result = oneKilometer.isEqualTo(thousandMeter);


        assertEquals(result, true);
    }

    @Test
    public void distance_shouldReturnFalse_WhenKilometerIs1AndMeterIs100() throws Exception {

        Measurement oneKilometer = new Measurement(1, Unit.KILOMETER);
        Measurement thousandMeter = new Measurement(100, Unit.Meter);

        boolean result = oneKilometer.isEqualTo(thousandMeter);


        assertEquals(result, false);
    }

    @Test
    public void distance_shouldReturnTrue_WhenGmIs1000AndKilogramIs1() throws Exception {

        Measurement oneKilogram = new Measurement(1, Unit.KILOGRAM);
        Measurement thousandGram = new Measurement(1000, Unit.GM);

        boolean result = oneKilogram.isEqualTo(thousandGram);


        assertEquals(result, true);
    }

    @Test
    public void distance_shouldReturnFalse_WhenGmIs100AndKilogramIs1() throws Exception {

        Measurement oneKilogram = new Measurement(1, Unit.KILOGRAM);
        Measurement thousandGram = new Measurement(100, Unit.GM);

        boolean result = oneKilogram.isEqualTo(thousandGram);


        assertEquals(result, false);
    }

    @Test
    public void distance_shouldReturnError_WhenGmIs1AndCmIs1() throws Exception {

        Measurement oneGm = new Measurement(1, Unit.GM);
        Measurement oneCm = new Measurement(1, Unit.Centimeter);

        boolean result = oneCm.isEqualTo(oneGm);


        assertEquals(result, true);
    }
}
