import static java.lang.Math.abs;

public class GameGeneration {
    private final Grid grid;
    private final int[][] dxdy;

    public GameGeneration(Grid grid) {
        this.grid = grid;
        this.dxdy = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
    }

    public void calculateNext() {
        int[][] gridBoard = this.grid.getGraiBoard();

        int rows = this.grid.getRows();
        int columns = this.grid.getColumns();

        for(int i =0; i< rows; i++){
            for(int j=0;j<columns;j++){

                int noOfLiveNeighbours = this.getLiveNeighbours(i,j);
                if((gridBoard[i][j] == 1) && (noOfLiveNeighbours<2 || noOfLiveNeighbours>3)){
                    gridBoard[i][j] = -1;
                }else if((gridBoard[i][j] == 0) && (noOfLiveNeighbours == 3)){
                    gridBoard[i][j] = 2;
                }
            }
        }

        gridBoard = this.convertGridToLiveAndDeadCells(gridBoard);
        this.grid.setGridBoard(gridBoard);
    }

    private int[][] convertGridToLiveAndDeadCells(int[][] gridBoard) {
        int rows = this.grid.getRows();
        int columns = this.grid.getColumns();

        for(int i =0; i< rows; i++){
            for(int j=0;j<columns;j++){
                if(gridBoard[i][j]>0){
                    gridBoard[i][j] = 1;
                }else{
                    gridBoard[i][j] = 0;
                }
            }
        }

        return gridBoard;
    }

    private boolean checkBoundries(int x, int y, int i, int j){

        int rows = this.grid.getRows();
        int columns = this.grid.getColumns();

        return (((i+x)>=0 && (i+x)<rows) && ((y+j)>=0 && (y+j)<columns));
    }

    private int getLiveNeighbours(int i,int j) {
        int liveNeighbours = 0;
        int[][] gridBoard = this.grid.getGraiBoard();

        for(int k=0;k<this.dxdy.length;k++){

            int x = this.dxdy[k][0];
            int y = this.dxdy[k][1];

            if(this.checkBoundries(x,y,i,j) == true){
                if(abs(gridBoard[i+x][j+y]) == 1){
                    liveNeighbours++;
                }
            }
        }
        return liveNeighbours;
    }
}
