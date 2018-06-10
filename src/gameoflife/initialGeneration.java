package gameoflife;

import java.util.Random;



public class initialGeneration {
    public static boolean[][] getgrid() {
        Random rand = new Random();

        final int GRIDSIZE = 60;
        final int OFFSET = GRIDSIZE/4;
        
        boolean[][] grid = new boolean[GRIDSIZE * 2][GRIDSIZE * 2];
               
//Gliders
        grid[5+OFFSET][4+OFFSET] = true;
        grid[6+OFFSET][4+OFFSET] = true;
        grid[7+OFFSET][4+OFFSET] = true;
        grid[7+OFFSET][3+OFFSET] = true;
        grid[6+OFFSET][2+OFFSET] = true;
        
        grid[17+OFFSET][10+OFFSET] = true;
        grid[18+OFFSET][10+OFFSET] = true;
        grid[19+OFFSET][10+OFFSET] = true;
        grid[19+OFFSET][9+OFFSET] = true;
        grid[18+OFFSET][8+OFFSET] = true;
  
//Small Exploder
        grid[10+OFFSET][20+OFFSET] = true;
        grid[11+OFFSET][20+OFFSET] = true;
        grid[11+OFFSET][19+OFFSET] = true;
        grid[11+OFFSET][21+OFFSET] = true;
        grid[12+OFFSET][19+OFFSET] = true;
        grid[12+OFFSET][21+OFFSET] = true;
        grid[13+OFFSET][20+OFFSET] = true;

//Exploder
        grid[20+OFFSET][30+OFFSET] = true;
        grid[20+OFFSET][28+OFFSET] = true;
        grid[20+OFFSET][32+OFFSET] = true;
        grid[21+OFFSET][28+OFFSET] = true;
        grid[22+OFFSET][28+OFFSET] = true;
        grid[23+OFFSET][28+OFFSET] = true;
        grid[24+OFFSET][28+OFFSET] = true;
        grid[21+OFFSET][32+OFFSET] = true;
        grid[22+OFFSET][32+OFFSET] = true;
        grid[23+OFFSET][32+OFFSET] = true;
        grid[24+OFFSET][32+OFFSET] = true;
        grid[24+OFFSET][30+OFFSET] = true;
        
//Blinker
        grid[40+OFFSET][38+OFFSET] = true;
        grid[41+OFFSET][38+OFFSET] = true;
        grid[42+OFFSET][38+OFFSET] = true;


        return grid;
    }
}
