/*
 * Programmer: HackOlympus  
 * Date      : 06 Jun 
 * Purpose   : millerRabin  
 */ 

import java.util.* ; 
import java.lang.* ; 

public class  millerRabin
{
    public static void main(String[] args)
    {
    	// pick number 
    	Scanner scan = new Scanner(System.in) ; 
    	System.out.print("Enter a number: ") ; 
    	int n = scan.nextInt() ; 
    	// number of rounds of testing to do 

    	System.out.print("No of rounds: ") ; 
    	int rounds = scan.nextInt() ; 

    	// rounds 
    	for (int i=0; i<rounds; i++)
    	{
    		// random number : [2,n-2]
    		int randomNum = 2 + (int) (Math.random() * (n-4)) ;

    	}
 

	}
}

