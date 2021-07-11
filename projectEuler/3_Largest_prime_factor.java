/*
 * Programmer: HackOlympus  
 * Date      : 10 Jun 
 * Purpose   : 3_Largest_prime_factor project euler   
 */ 

/*
 * PLAN 
 * Use Sieve of erothoneses to get all prime in range [0,sqrt(n)]
 * start from behind and see if number is factor of n or not 
 * if factor print and code ends 
 */ 


import java.util.* ; 
import java.lang.* ; 

public class Largest_prime_factor
{
    private boolean[] arr ;
    private long n  ; 
    public Largest_prime_factor(long n)
    {
        this.n = n ; 
        int a  = (int) Math.sqrt(n) ; 
        arr = new boolean[a] ; 
        arr[0] = false ; 
        arr[1] = false ; 
        for (int i=2;i<arr.length;i++)
        {
            arr[i] = true ; 
        }
    }
    
    public void findPrime() 
    {
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]) 
            {
                for (int j=i;j<arr.length;j+=i)
                {
                    if (j != i) arr[j] = false ; 
                }
            }
        }
    }
    public void primeFactor() 
    {
        findPrime() ; 
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] && (n % i == 0))  System.out.println(i) ; 
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in) ; 
        System.out.print("Number: ") ;  
        long n = scan.nextLong() ;  
        Largest_prime_factor obj = new Largest_prime_factor(n) ; 
        obj.primeFactor() ; 
    }
}

