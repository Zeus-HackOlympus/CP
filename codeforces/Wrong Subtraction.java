/*
 * Programmer  : HackOlympus 
 * Date        : 29 Jun 2021
 * Purpose     : Wrong Subtraction 
 */ 

import java.util.* ; 
import java.lang.* ; 

public class wrong_subtraction
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in) ; 
        int n,k ; 
        n = scan.nextInt() ; 
        k = scan.nextInt() ;  
     
        while (k-- > 0)
        {
            if (n % 10 != 0) n-- ; 
            else n = n/10 ; 
        }
        System.out.println(n) ; 
     
    }

}  

