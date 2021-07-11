/*
 * Programmer: HackOlympus  
 * Date: 25 May 
 * Purpose: Calc_Odds_For_Birthday_Paradox  
 */ 

/*
 * What are the odds if we pick 2 numbers between 0 and 1000, i and j and it satisfies :  i - j = 42 
 */ 

import java.lang.Math ; 
import java.util.ArrayList ; 
import java.util.Scanner ; 
public class Calc_Odds_For_Birthday_Paradox
{
    public static void main(String[] args){
        int exp_trials = 100000 ; 
        // int rand = (int)(Math.rand() * 1000 )+ 100 
        int total =  0 ; 
        int x = 0 ;
        Scanner input = new Scanner(System.in) ; 
        System.out.print("k = ") ; 
        int k = input.nextInt() ; 
        System.out.println("\nYou entered = "+k) ; 

        int[] p = new int[k* 4] ; // 4 is size of int (4 bytes) 
        int nsucc = 0 ; 
        for (int j=0; j<exp_trials ; ++j) {
            int success = 0 ;  
            for (int i=0 ; i<k; ++i) {
                p[i] = 1+(int)(365*(double)Math.random()) ; 
                for (int l=0; l<i; ++l){
                    if (p[l] - p[i] == 0){
                        success = 1 ; 
                        break ; 
                    }
                }
            }
            if (success == 1){
                nsucc++ ; 
            }
        }
        System.out.println("probability = " + (double)nsucc / (double)exp_trials  ) ;  
    }
}
