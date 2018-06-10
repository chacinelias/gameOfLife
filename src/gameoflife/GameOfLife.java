package gameoflife;

import java.util.Timer;
import java.util.TimerTask;

public class GameOfLife {

    public static void main(String[] args) {
        Timer timer = new Timer();

        class Task extends TimerTask{
            static final int GRIDSIZE = 60;
            final int OFFSET = GRIDSIZE/4;
            int gen = 0;
            boolean[][] grid = initialGeneration.getgrid();
            
            @Override
            public void run(){
                int[][] neighbors = new int[GRIDSIZE * 2][GRIDSIZE * 2];
                
                System.out.println("\nGeneration: " + ++gen);          
                for(int m=OFFSET; m<GRIDSIZE; m++){
                    for(int n=OFFSET; n<GRIDSIZE; n++){
                       if(grid[m][n]){
                            System.out.print("0 ");
                        }else{
                            System.out.print("- ");
                        }
                    }
                    System.out.println("");
                }
                //debug printout for neighbor array:
//                for(int v=OFFSET; v<GRIDSIZE; v++){
//                    for(int w=OFFSET; w<GRIDSIZE; w++){
//                        System.out.print(neighbors[v][w]+" ");
//                    }
//                    System.out.println("");
//                }
                
                for(int i=OFFSET; i<GRIDSIZE; i++){
                    for(int j=OFFSET; j<GRIDSIZE; j++){
                        if(grid[i-1][j-1]){neighbors[i][j]++;}
                        if(grid[i-1][j]){neighbors[i][j]++;}
                        if(grid[i-1][j+1]){neighbors[i][j]++;}
                        if(grid[i][j-1]){neighbors[i][j]++;}
                        if(grid[i][j+1]){neighbors[i][j]++;}
                        if(grid[i+1][j-1]){neighbors[i][j]++;}
                        if(grid[i+1][j]){neighbors[i][j]++;}
                        if(grid[i+1][j+1]){neighbors[i][j]++;}
                    }
                }
                
                for(int k=OFFSET; k<GRIDSIZE; k++){
                    for(int l=OFFSET; l<GRIDSIZE; l++){
                        if(neighbors[k][l] < 2){
                            grid[k][l] = false;
                        }else if(grid[k][l] && (neighbors[k][l] == 2 || neighbors[k][l] == 3)){
                            grid[k][l] = grid[k][l];
                        }else if(neighbors[k][l] > 3){
                            grid[k][l] = false;
                        }else if(!grid[k][l] && neighbors[k][l] == 3){
                            grid[k][l] = true;
                        }
                    }
                }
                 System.out.print("\n\n\n\n\n");
            }
        }
        timer.scheduleAtFixedRate(new Task(), 0, 250);
    }
}

/*Any live cell with fewer than two live neighbors dies 
Any live cell with two or three live neighbors lives on to the next generation
Any live cell with more than three live neighbors dies 
Any dead cell with exactly three live neighbors becomes a live cell*/