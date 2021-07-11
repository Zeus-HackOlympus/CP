/*
 * Programmer: HackOlympus  
 * Date: 04 Jun 
 * Purpose: 4th Problem - Java Stdin and Stdout II
 */ 

import java.util.* ; 

public class solution
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in) ; 
        
        Integer a = scan.nextInt() ; 
        Double b = scan.nextDouble() ;
        scan.nextLine() ;
        String c = scan.nextLine() ; 
        
        System.out.println("String: " + c) ; 
        System.out.println("Double: "+ b) ; 
        System.out.println("Int: "+a) ; 

    }
}

