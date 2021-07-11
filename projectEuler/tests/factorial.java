/*
 * Programmer: HackOlympus  
 * Date: 04 Jun 
 * Purpose: recursion factorial program  
 */ 

public class factorial 
{
    public static int  factorial(int n)
    {
        if (n==1) return 1 ; 
        return n * factorial(n-1) ; 
    }
    public static void main(String[] args)
    {
        System.out.println(factorial(10)) ; 
    }
}

