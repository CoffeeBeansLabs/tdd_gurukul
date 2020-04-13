package Unit.java;

public class GridCreation {
    int row;
    int col;
    int[][] grid;
    int[][] updatedGrid;
    String input;
    public void newGenerationGrid(){
        int r,c;
        int liveCount=0;
        createUpdatedGrid();

        //create new generation grid updatedGrid

        //getting neighbours
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                liveCount=0;
                r=i;
                c=j;
                for(int m=r-1;m<=r+1;m++){
                    if(m<0 | m>row-1) continue;
                    for(int n=c-1;n<=c+1;n++){
                        if(n<0 | n>col-1) continue;
                        if(m==i && n==j) continue;
                        //state=gameGrid.getValueOfCell(m,n);
                        if(grid[m][n]==1)liveCount=liveCount+1;


                    }
                }
                //check rule 1 ,rule 2, rule3
                if(grid[i][j]==1){
                    if(liveCount<2 | liveCount>3) updatedGrid[i][j]=0;
                }
                else if(grid[i][j]==0){
                    if(liveCount==3) updatedGrid[i][j]=1;
                }

            }
        }






    }

    private void createUpdatedGrid() {
        this.updatedGrid=new int[this.row][this.col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                updatedGrid[i][j]=grid[i][j];
            }
        }
    }

    public String getLiveCellsOutput() {
       String output="";
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(updatedGrid[i][j]==1) {
                    output=output+i+","+j+" ";
                }
            }
        }
        return output;
    }



    public GridCreation(int row, int col) {
        this.row=row;
        this.col=col;
        createEmptyGrid();
    }

    private void createEmptyGrid() {
        this.grid = new int[this.row][this.col];
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
             this.grid[i][j]=0;
            }
        }
    }

    public void setAliveInGrid(String input) {
        this.input=input;
        //split and create live grid
        String[] aliveCells=input.split(" ");
        for(int i=0;i<aliveCells.length;i++) {
            String[] indices = aliveCells[i].split(",");
            int r=Integer.parseInt(indices[0]);
            int c=Integer.parseInt(indices[1]);
            grid[r][c]=1;
        }

    }

}
