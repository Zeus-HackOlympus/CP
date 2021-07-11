/*
 * Programmer: HackOlympus  
 * Date      : 10 Jun 
 * Purpose   : Special_Pythagorean_triplet problem 9 project euler  
 */ 

/*
 * PLAN
 * We will use euclidean formula: 
 * a = m^2 - n^2 
 * b = 2mn 
 * c = m^2 + n^2 
 * given m and n are coprime and either of them must be a prime
 */ 



import java.util.* ; 
import java.lang.* ; 

public class Special_Pythagorean_triplet  
{
    public static long gcd(long a,long b)
    {
        if (b % a == 1) return (long)1 ;  
        else if (b % a > 1 ) return gcd(b%a, a) ;
        else  return a  ;

    }
    public static void main(String[] args)
    {
         
    }
}

