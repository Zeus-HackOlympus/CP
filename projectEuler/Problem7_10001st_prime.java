/*
 * Programmer: HackOlympus  
 * Date      : 10 Jun 
 * Purpose   : Problem7_10001st_prime project euler problem 7 
 */ 

import java.util.* ; 
import java.lang.* ; 

public class problem7
{   
    public static void fill(boolean[] arr)
    {
        arr[0] = false ; 
        arr[1] = false ; 
        for (int i=2;i<arr.length;i++)
        {
            arr[i] = true ; 
        }
    }
    public static void main(String[] args)
    {
        // sieve of erathonesis to get primes 
        boolean[] arr = new boolean[200000] ;
        fill(arr) ; 
        for (int i=2;i<arr.length;i++)
        {
            if (arr[i])
                for (int j=i;j<arr.length;j+=i)
                {
                    if (j!=i)
                    {
                        arr[j] = false ;
                    }
                }
        }
        int primes = 0 ;  
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]) 
            {
                primes++ ; 
            }
            if (primes == 10001) {
                System.out.println(i);
                break;
            }//System.out.println(i) ; 
        }
    }
}


