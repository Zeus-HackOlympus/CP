/*
 * Programmer: HackOlympus  
 * Date: 04 Jun 
 * Purpose: 3rd problem of java practice  
 */ 

import java.util.* ; 

public class solution
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in) ; 
        int n = scan.nextInt() ; 
        if (n%2!=0) System.out.println("Weird") ; 
        else if (n%2==0 && n <=5 && n>=2) System.out.println("Not Weird") ; 
        else if (n%2==0 && n <=20 && n>=6) System.out.println("Weird") ; 
        else if (n%2==0 && n>20) System.out.println("Not Weird") ; 
        
    }
}

