/*
 * Programmer: HackOlympus  
 * Date: 05 Jun 
 * Purpose: I am feeling lucky prime algo :)  
 */ 

import java.lang.* ; 
import java.util.* ; 
public class prime
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in) ; 
        System.out.print("Number: ") ; 
        int a = scan.nextInt() ; 
        int num  = (int)(2 + Math.random()*a) ;
        if (a % num == 0) System.out.println(a + " is a factor") ; 
        else System.out.println("Factor not found but there may be some") ; 
    }
}

