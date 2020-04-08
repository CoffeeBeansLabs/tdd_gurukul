import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeasurementTest {

    @Test
    public void distance_shouldReturnTrue_WhenCentimeterIs100AndMeterIs1() {

        Measurement hundredCentimeter = new Measurement(100, Unit.Centimeter);
        Measurement oneMeter = new Measurement(1, Unit.Meter);

        boolean result = oneMeter.isEqualTo(hundredCentimeter);

        assertEquals(result, true);
    }

    @Test
    public void distance_shouldReturnFalse_WhenCentimeterIs10AndMeterIs1() {

        Measurement hundredCentimeter = new Measurement(10, Unit.Centimeter);
        Measurement oneMeter = new Measurement(1, Unit.Meter);

        boolean result = oneMeter.isEqualTo(hundredCentimeter);

        assertEquals(result, false);
    }

    @Test
    public void distance_shouldReturnTrue_WhenKilometerIs1AndMeterIs1000() {

        Measurement oneKilometer = new Measurement(1, Unit.KILOMETER);
        Measurement thousandMeter = new Measurement(1000, Unit.Meter);

        boolean result = oneKilometer.isEqualTo(thousandMeter);


        assertEquals(result, true);
    }

    @Test
    public void distance_shouldReturnFalse_WhenKilometerIs1AndMeterIs100() {

        Measurement oneKilometer = new Measurement(1, Unit.KILOMETER);
        Measurement thousandMeter = new Measurement(100, Unit.Meter);

        boolean result = oneKilometer.isEqualTo(thousandMeter);


        assertEquals(result, false);
    }

    @Test
    public void distance_shouldReturnTrue_WhenGmIs1000AndKilogramIs1() {

        Measurement oneKilogram = new Measurement(1, Unit.KILOGRAM);
        Measurement thousandGram = new Measurement(1000, Unit.GM);

        boolean result = oneKilogram.isEqualTo(thousandGram);


        assertEquals(result, true);
    }

    @Test
    public void distance_shouldReturnFalse_WhenGmIs100AndKilogramIs1() {

        Measurement oneKilogram = new Measurement(1, Unit.KILOGRAM);
        Measurement thousandGram = new Measurement(100, Unit.GM);

        boolean result = oneKilogram.isEqualTo(thousandGram);


        assertEquals(result, false);
    }
}
