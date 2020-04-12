import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GameOfLifeTest {
    @Test
    public void gameOfLife_shouldReturnNextGenerationUntilQuit_given1Next(){
        String input = "1,1 1,2 1,3 2,2 2,3 2,4";

        Grid grid  = new Grid(4,6);
        grid.createEmptyGrid();
        grid.assignLives(input);

        GameGeneration generation = new GameGeneration(grid);
        generation.calculateNext();

        String outputString = grid.getOutputStringFromBoard();
        assertEquals("0,2 1,1 1,4 2,1 2,4 3,3",outputString);

    }

    @Test
    public void gameOfLife_shouldReturnNextGenerationUntilQuit_given2NextAnd3X3Matrix(){
        String input = "1,1 1,2 2,1 2,2";

        Grid grid  = new Grid(4,4);
        grid.createEmptyGrid();
        grid.assignLives(input);

        GameGeneration generation = new GameGeneration(grid);

        generation.calculateNext();
        generation.calculateNext();

        String outputString = grid.getOutputStringFromBoard();

        assertEquals("1,1 1,2 2,1 2,2",outputString);
    }

    @Test
    public void gameOfLife_shouldReturnNextGenerationUntilQuit_given2NextAnd2X3Matix(){
        String input = "1,0 1,1 1,2";

        Grid grid  = new Grid(3,4);
        grid.createEmptyGrid();
        grid.assignLives(input);

        GameGeneration generation = new GameGeneration(grid);

        generation.calculateNext();
        generation.calculateNext();

        String outputString = grid.getOutputStringFromBoard();

        assertEquals("1,0 1,1 1,2",outputString);
    }

    @Test
    public void gameOfLife_shouldReturnNextGenerationUntilQuit_given1NextAnd3X3Matix(){
        String input = "0,1 1,0 2,1 0,2 1,2";

        Grid grid  = new Grid(4,4);
        grid.createEmptyGrid();
        grid.assignLives(input);

        GameGeneration generation = new GameGeneration(grid);

        generation.calculateNext();


        String outputString = grid.getOutputStringFromBoard();

        assertEquals("0,1 1,0 2,1 0,2 1,2",outputString);
    }
}
