/*
 * Programmer: HackOlympus  
 * Date: 04 Jun 
 * Purpose: fibonacci program in java  
 */ 

class fibonacci
{
    public static int fib(int n)
    {
        if (n>=2) return fib(n-1) + fib(n-2) ;
        return 1 ; 
    }
    public static void main(String[] args)
    {
        double c = 0 ; 
        // first 10 fib nums
        int i = 1 ; 
        while (fib(i) < 4000000){
             System.out.print(fib(i) + " ") ; 
             if (fib(i) % 2 == 0) c+=fib(i) ;
             i++ ; 
        }
        System.out.println("\nAnswer = "+ (int)c); 
    }
}

