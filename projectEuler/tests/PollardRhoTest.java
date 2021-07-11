/*
 * Programmer: HackOlympus  
 * Date      : 06 Jun 
 * Purpose   : Test version of java implementation of Pollard Rho Algorithm 
 */ 

import java.util.* ; 
import java.lang.* ; 

public class Pollard_Rho_Test  
{   
    public static int gcd(int a, int b)
    {
        // a < b 
        if (a == 1) return 1 ; 
        else if (a%b > 1) return gcd(b%a,b) ;
        else return a ; 
    }

    public static int f(int x, int n)
    {
        return ((x*x) - 1 ) % n ; 
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in) ; 
        
        // ask for the number 
        System.out.print("Number: ") ; 
        int n = scan.nextInt() ; 
        int[] primes = new int[n] ; // array to contain all results  
    
        int c = 0 ; // count for array index 

        int x = 2; // first num of difference 
        int y = 2; // second num
        
        int d = 1 ;  // conditional for checking gcd 
        // int a = 2 ;  // a of random number generator (x^2 + a ) mod n 

        while ( d == 1 ){
            x = f(x,n) ; 
            y = f(f(y,n),n) ;
            d = gcd(Math.abs(x-y),n) ; 
            //if (d > 1) {
                // a = d ; 
                primes[c] = Math.abs(x-y) ;
                c++ ; 
                System.out.println(Math.abs(x-y)) ; // print result   
            //}
        }
    }
}

