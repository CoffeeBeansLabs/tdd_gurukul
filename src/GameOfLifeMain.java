import java.util.Scanner;

public class GameOfLifeMain {
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter alive cells:");

        String input = inputObj.nextLine();

        String[] liveCells = input.split(" ");

        int maxRow = 0;
        int maxColumn = 0;

        for(int i =0;i<liveCells.length;i++){
            String[] indexes = liveCells[i].split(",");
            int row = Integer.parseInt(indexes[0]);
            int column = Integer.parseInt(indexes[1]);
            if(row>maxRow){
                maxRow = row;
            }
            if(column>maxColumn){
                maxColumn = column;
            }
        }

        Grid grid  = new Grid(maxRow+2,maxColumn+2);
        grid.createEmptyGrid();
        grid.assignLives(input);

        GameGeneration generation = new GameGeneration(grid);


        Scanner nextInputObj = new Scanner(System.in);
        String nextInput = inputObj.nextLine();
        while(!nextInput.equals("quit")){
            if(nextInput.equals("next")){
                generation.calculateNext();
                String outputString = grid.getOutputStringFromBoard();
                System.out.println("Next generation:"+ outputString);
            }else{
                System.out.println("Wrong Input");
            }
            nextInput = inputObj.nextLine();
        }
    }
}
