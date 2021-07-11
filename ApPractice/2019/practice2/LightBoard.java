/*
 * Programmer: HackOlympus  
 * Date: 31 May 
 * Purpose: LightBoard  
 */ 

import java.lang.Math ; 

public class LightBoard  
{
    private boolean[][] lights ; 

    public LightBoard(int row, int cols)
    {
        lights = new boolean[row][cols] ; 
        for (int i=0; i< row; i++){
            for (int j =0 ; j<cols ; j++) {
                double prob = Math.random() ; 
                if (prob <= 0.4) {
                    lights[i][j] = true ; 
                }
                else lights[i][j] = false ; 
            }
        }
    }

    public boolean evaluateLight(int row, int col)
    {
        boolean on = lights[row][col] ; 
        int NumOfOn  = 0 ; 
        for (int i=0; i<lights[0].length;i++){
                if (lights[row][i]) NumOfOn++ ; 
        }
        if (on) { if (NumOfOn % 2 == 0) return false ; }
        else { if (NumOfOn%3 == 0) return true ; }
        return on ; 
    }

    public void getBoard()
    {
        for (int i=0; i<lights.length; i++){
            for (int j=0; j<lights[0].length; j++){
                System.out.print( lights[i][j] + "  ") ; 
            }
            System.out.println() ; 
        }
        System.out.println() ;
    }
    public static void main(String[] args)
    {
        LightBoard sim = new LightBoard(7,5) ; 
        sim.getBoard() ;
        System.out.println(sim.evaluateLight(0,1)) ; 

    }
}

