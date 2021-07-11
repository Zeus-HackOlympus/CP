/*
 * Programmer: HackOlympus  
 * Date      : 12 Jun 
 * Purpose   : Summation_of_first_N_num  
 */ 

import java.util.* ; 
import java.lang.* ; 

class Summation_of_first_N_num 
{
    public static void Summation(int n)
    {
        long sum = 0 ; 
        for (int i=0;i<=n;i++)
        {
            sum += i ; 
        }
        System.out.println(sum)
    }
    public static void main(String[] args)
    {
        System.out.println("------------------------- START --------------------------\n") ; 
        final long startTime = System.currentTimeMillis(); 

        // main code :         
        Scanner scan = new Scanner(System.in) ; 
        System.out.print("Number: ") ; 
        int n = scan.nextInt() ;  
        Summation(n) ; 

        final long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time (s): " + (endTime - startTime)/1000.0);
        System.out.println("\n----------------------- FINISHED -------------------------") ; 
    }
}

