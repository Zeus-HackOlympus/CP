/*
 * Programmer: HackOlympus  
 * Date: 29 May 
 * Purpose: LightBoard  
 */ 

import java.lang.Math ; 

public class LightBoard    
{
    private boolean[][] lights ; 
    private int rows ; 
    private int cols ; 
    private double t = 0  ; 
    private double f = 0 ; 

    public LightBoard(int rows, int cols)
    {
        this.rows = rows ; 
        this.cols = cols ; 
        lights = new boolean[rows][cols] ; 
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                double prob = Math.random() ; 
                lights[i][j] = (prob > 0.4) ; 
                if (lights[i][j]) t++ ; 
                else f++ ; 
            }
        }
    }

    public boolean evaluateLight(int r, int c) 
    {
        boolean status = lights[r][c] ; 
        int count = 0 ; 
        if (status){
            for (int i=0; i<c; i++){
                if (lights[r][i]) count++ ; 
            }
            if (count%2 == 0) return false ; 
        }
        else if (!status){
            for (int i=0; i<c; i++){
                if (lights[r][i]) count++ ; 
            }
            if (count%3==0) return true ; 
        }
        return status ; 
    }

    public void printLightBoard()
    {
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(lights[i][j] + " ") ; 
            }
            System.out.println() ; 
        }
    
        System.out.println("\ntrue = "+t) ; 
        System.out.println("false= "+ f) ;
        System.out.println("probability = " + (double)(t/(t+f))*100 ) ; 
    }

    public static void main(String[] args){
        
        LightBoard sim = new LightBoard(7,5) ; 
        sim.printLightBoard() ; 
        System.out.println(sim.evaluateLight(0,3)) ;  
        System.out.println(sim.evaluateLight(6,0)) ;
        System.out.println(sim.evaluateLight(4,1)) ;
        System.out.println(sim.evaluateLight(5,4)) ; 
    }
}

