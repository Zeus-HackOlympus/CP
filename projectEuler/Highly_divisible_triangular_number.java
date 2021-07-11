/*
 * Programmer: HackOlympus  
 * Date      : 12 Jun 
 * Purpose   : Highly_divisible_triangular_number  
 */ 

import java.util.* ; 
import java.lang.* ; 

class Highly_divisible_triangular_number 
{
    public static long getTriangleNum(long n)
    {
        long sum = 0 ; 
        for (int i=0;i<=n;i++)
        {
            sum += i ; 
        }
        return sum ; 
    }

    public static int getFactorNum(long n)
    {
        int count = 2 ;  
            for (int i=2;i*i<n;i++)
            {
                if ((n % i) == 0) count +=2 ; 
                else if (i * i == n) count++ ; 
            }
            return count ; 

    }
    public static void main(String[] args)
    {
        System.out.println("------------------------- START --------------------------\n") ; 
        final long startTime = System.currentTimeMillis(); 

        // main code :       
        int n = 0 ; 
        long triangle = getTriangleNum(n) ; 
        while (getFactorNum(triangle) <= 500 ){
            n++ ; 
        }
        System.out.println("triangle number = " + triangle + "n = " + n) ; 

        final long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time (s): " + (endTime - startTime)/1000.0);
        System.out.println("\n----------------------- FINISHED -------------------------") ; 
    }
}

