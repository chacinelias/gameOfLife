package gameoflife;

import java.util.Random;



public class initialGeneration {
    public static boolean[][] getgrid() {
        Random rand = new Random();

        final int GRIDSIZE = 60;
        final int OFFSET = GRIDSIZE/4;
        
        boolean[][] grid = new boolean[GRIDSIZE * 2][GRIDSIZE * 2];
               
//Gliders
//        grid[5+OFFSET][4+OFFSET] = true;
//        grid[6+OFFSET][4+OFFSET] = true;
//        grid[7+OFFSET][4+OFFSET] = true;
//        grid[7+OFFSET][3+OFFSET] = true;
//        grid[6+OFFSET][2+OFFSET] = true;
//        
//        grid[17+OFFSET][10+OFFSET] = true;
//        grid[18+OFFSET][10+OFFSET] = true;
//        grid[19+OFFSET][10+OFFSET] = true;
//        grid[19+OFFSET][9+OFFSET] = true;
//        grid[18+OFFSET][8+OFFSET] = true;
  
//Small Exploder
        grid[25+OFFSET][35+OFFSET] = true;
        grid[26+OFFSET][35+OFFSET] = true;
        grid[26+OFFSET][34+OFFSET] = true;
        grid[27+OFFSET][34+OFFSET] = true;
        grid[27+OFFSET][36+OFFSET] = true;
        grid[28+OFFSET][35+OFFSET] = true;

//Exploder

        
        grid[20+OFFSET][8+OFFSET] = true;
        grid[21+OFFSET][8+OFFSET] = true;
        grid[22+OFFSET][8+OFFSET] = true;
        grid[23+OFFSET][8+OFFSET] = true;
        grid[24+OFFSET][8+OFFSET] = true;
        
        grid[20+OFFSET][10+OFFSET] = true;

        grid[20+OFFSET][12+OFFSET] = true;        
        grid[21+OFFSET][12+OFFSET] = true;
        grid[22+OFFSET][12+OFFSET] = true;
        grid[23+OFFSET][12+OFFSET] = true;
        grid[24+OFFSET][12+OFFSET] = true;
        
        grid[24+OFFSET][10+OFFSET] = true;
        

//Gun
        grid[4+OFFSET][0+OFFSET] = true;
        grid[4+OFFSET][1+OFFSET] = true;
        grid[5+OFFSET][0+OFFSET] = true;
        grid[5+OFFSET][1+OFFSET] = true;
        
        grid[4+OFFSET][10+OFFSET] = true;
        grid[5+OFFSET][10+OFFSET] = true;
        grid[6+OFFSET][10+OFFSET] = true;
        
        grid[3+OFFSET][11+OFFSET] = true;
        grid[7+OFFSET][11+OFFSET] = true;

        grid[2+OFFSET][12+OFFSET] = true;
        grid[8+OFFSET][12+OFFSET] = true;
        
        grid[2+OFFSET][13+OFFSET] = true;
        grid[8+OFFSET][13+OFFSET] = true;
                
        grid[5+OFFSET][14+OFFSET] = true;
        
        grid[3+OFFSET][15+OFFSET] = true; 
        grid[7+OFFSET][15+OFFSET] = true;
        
        grid[4+OFFSET][16+OFFSET] = true;
        grid[5+OFFSET][16+OFFSET] = true;
        grid[6+OFFSET][16+OFFSET] = true;
        
        grid[5+OFFSET][17+OFFSET] = true;
        
        grid[2+OFFSET][20+OFFSET] = true;
        grid[3+OFFSET][20+OFFSET] = true;
        grid[4+OFFSET][20+OFFSET] = true;
        
        grid[2+OFFSET][21+OFFSET] = true;
        grid[3+OFFSET][21+OFFSET] = true;
        grid[4+OFFSET][21+OFFSET] = true;
        
        grid[1+OFFSET][22+OFFSET] = true;
        grid[5+OFFSET][22+OFFSET] = true;
        
        grid[1+OFFSET][24+OFFSET] = true;
        grid[0+OFFSET][24+OFFSET] = true;
        grid[5+OFFSET][24+OFFSET] = true;
        grid[6+OFFSET][24+OFFSET] = true;
        
        grid[3+OFFSET][34+OFFSET] = true;
        grid[3+OFFSET][35+OFFSET] = true;
        grid[4+OFFSET][34+OFFSET] = true;
        grid[4+OFFSET][35+OFFSET] = true;        


//Blinker
        grid[40+OFFSET][38+OFFSET] = true;
        grid[41+OFFSET][38+OFFSET] = true;
        grid[42+OFFSET][38+OFFSET] = true;
        
        
//10-cell row
        grid[40+OFFSET][10+OFFSET] = true;
        grid[40+OFFSET][11+OFFSET] = true;
        grid[40+OFFSET][12+OFFSET] = true;
        grid[40+OFFSET][13+OFFSET] = true;
        grid[40+OFFSET][14+OFFSET] = true;
        grid[40+OFFSET][15+OFFSET] = true;
        grid[40+OFFSET][16+OFFSET] = true;
        grid[40+OFFSET][17+OFFSET] = true;
        grid[40+OFFSET][18+OFFSET] = true;
        grid[40+OFFSET][19+OFFSET] = true;


        return grid;
    }
}
