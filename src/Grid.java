import jdk.nashorn.api.scripting.ScriptObjectMirror;

public class Grid {
    private int[][] gridBoard;
    private final int rows;
    private final int columns;


    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.gridBoard = new int[rows][columns];
    }

    public int[][] getGraiBoard(){
        return this.gridBoard;
    }

    public int getRows(){
        return this.rows;
    }

    public int getColumns(){
        return this.columns;
    }

    public void setGridBoard(int[][] gridBoard) {
        this.gridBoard = gridBoard;
    }

    public void createEmptyGrid() {
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.columns;j++){
                this.gridBoard[i][j] = 0;
            }
        }
    }

    public void assignLives(String input) {
        String[] liveCells = input.split(" ");
        for(int i =0;i<liveCells.length;i++){
            String[] indexes = liveCells[i].split(",");
            int row = Integer.parseInt(indexes[0]);
            int column = Integer.parseInt(indexes[1]);
            this.gridBoard[row][column] = 1;
        }
    }

    public String getOutputStringFromBoard() {
        String outputString = "";
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(this.gridBoard[i][j] == 1){
                    outputString=outputString+i+","+j+" ";
                }
            }
        }
        return outputString.trim();
    }
}
