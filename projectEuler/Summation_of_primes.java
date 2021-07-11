/*
 * Programmer: HackOlympus  
 * Date      : 11 Jun 
 * Purpose   : Summation_of_primes  
 */ 

import java.util.* ; 
import java.lang.* ;
import java.math.* ; 

public class Summation_of_primes 
{
    private boolean[] arr ; 
    public Summation_of_primes()
    {
        arr  = new boolean[2000000] ; 
        arr[0] = false ; 
        arr[1] = false ; 
        for (int i=2;i<arr.length;i++)
        {
            arr[i] = true ; 
        }
    }

    public void markPrimes()
    {
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i])
            {
                for (int j=i;j<arr.length;j+=i)
                {
                    if (j!=i)
                    {
                        arr[j] = false ; 
                    }
                }
            }
        }
    }

    public void sumOfprimes()
    {
        BigInteger sum  = new BigInteger("0");  
        long num = 0 ; 

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i])
            {
                sum = sum.add(BigInteger.valueOf(i)) ; 
                num++ ;
                if (num < 1000) System.out.println("First " + num + " primes found") ;  
                else if (num % 100 == 0) System.out.println("First " + num + " primes found") ;  
            }
        }
    
        System.out.println("\n\nSum = " + sum + "\n"  ) ; 
        
    }
    public static void main(String[] args)
    {
        System.out.println("------------------------- START --------------------------") ;
        final long startTime = System.currentTimeMillis();
        
        // main code :  

        Summation_of_primes obj = new Summation_of_primes() ; 
        obj.markPrimes() ; 
        obj.sumOfprimes() ; 


        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time (ms): " + (endTime - startTime));
        System.out.println("----------------------- FINISHED -------------------------") ;

    }
}

