import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkingAreaTest {

    @Test
    public void park_should_return_true() {
        ParkingArea  pArea = new ParkingArea();
        boolean parked = pArea.park();
        assertEquals(parked, true);
    }
}
