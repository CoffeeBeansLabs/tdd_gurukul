import Unit.java.GridCreation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class gameOfLifeTest {

    @Test
    public void testNewGenerationShouldReturnTrue() {
        String input="1,1 1,2 2,1 2,2 ";
        GridCreation gameGrid=new GridCreation(3,3);
        gameGrid.setAliveInGrid(input);
        gameGrid.newGenerationGrid();
        assertEquals( "1,1 1,2 2,1 2,2 ",gameGrid.getLiveCellsOutput());

    }

}
