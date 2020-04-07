import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistanceTest {
    @Test
    public  void  isEqualTo_shouldReturnTrue_given100CmAnd1Meter(){

        Distance hunderedCm = new Distance(100,Unit.CENTIMETER);
        Distance oneMeter   =  new Distance(1,Unit.METER);

        Boolean result = hunderedCm.isEqualTo(oneMeter);

        assertEquals(true,result);
    }

    @Test
    public  void  isEqualTo_shouldReturnFalse_givenMinus100CmAnd1Meter(){

        Distance hunderedCm = new Distance(100,Unit.CENTIMETER);
        Distance oneMeter   =  new Distance(1,Unit.METER);

        Boolean result = hunderedCm.isEqualTo(oneMeter);

        assertEquals(false,result);
    }
}
