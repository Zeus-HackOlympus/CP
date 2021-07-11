/*
 * Programmer: HackOlympus  
 * Date: 04 Jun 
 * Purpose: fibonacci program in java  
 */ 

import java.util.* ; 
public class fibonacci
{
    public static int fib(int n)
    {
        if (n>=2) return fib(n-1) + fib(n-2) ;
        return 1 ; 
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in) ; 
        System.out.print("Term: ") ; 
        int a = scan.nextInt() ;
        for (int i=0;i<a; i++){
            System.out.print(fib(i) + " ") ;     
        }
        System.out.println() ; 
                 
    }
}


