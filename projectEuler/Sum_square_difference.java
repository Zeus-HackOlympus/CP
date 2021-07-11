/*
 * Programmer: HackOlympus  
 * Date      : 10 Jun 
 * Purpose   : Sum_square_difference project euler - problem 6  
 */ 

import java.util.* ; 
import java.lang.* ; 

public class Sum_square_difference
{
    public static void main(String[] args)
    {
        long sum = 0 ; 
        for (long i=1;i<101;i++)
        {
            sum+=i ; 
        }
        sum = sum*sum ; 
        long sumSq = 0 ; 
        for (long j=1;j<101;j++)
        {
            sumSq += j*j ; 
        }
        System.out.println(sum-sumSq) ; 
    }
}

