/*
 * Programmer: HackOlympus  
 * Date      : 10 Jun 
 * Purpose   : 4 Largest palindrome product project euler  
 */ 

/*
 * PLAN 
 * Start from 999 * 999 = 998001 till 10000
 * Check if number is palindrome or not 4_Largest_palindrome_product.java 
 * if palindrom stop program 
 * print result 
 */ 


import java.util.* ; 
import java.lang.* ; 

class Largest_palindrome_product
{
    public static boolean isPalindrome(int n)
    {
        int rev = 0 ;
        int num = n ; 
        while (num > 0)
        {
            rev = (rev * 10) + (num % 10); // add in int rev  
            num = num / 10 ; // remove last digit 
        }
        return (rev == n) ; 
    }
    public static int max(ArrayList<Integer> arr)
    {
        int max = arr.get(0) ; 
        for (int i=0;i<arr.size();i++)
        {
            if (arr.get(i) > max) max = arr.get(i) ; 
        }
        return max ; 
    }
    public static void main(String[] args)
    {

        System.out.println("------------------------- START --------------------------\n") ;
        final long startTime = System.currentTimeMillis();

        // main code 
        
        System.out.println(isPalindrome(9009)) ;
        System.out.println(isPalindrome(98)) ;
        ArrayList<Integer> arr = new ArrayList<Integer>() ; 
        // must be a palindrome in this rangeu 
        for (int i=999;i>900;i--)
        {   
            for (int j=999;j>900;j--)
            {
                if (isPalindrome(i*j))
                {   
                    System.out.println("Added...") ; 
                    arr.add(i*j) ;  
                }
            }
        }
        if (arr.get(0) == 0) System.out.println("Array Length = 0") ; 
        else {
            System.out.println("Testing......") ; 
            System.out.println("ArrayList Length = "+arr.size()) ;
            System.out.println(max(arr)) ;
        }


        final long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time (s): " + (endTime - startTime)/1000.0);
        System.out.println("\n----------------------- FINISHED -------------------------") ;

    }
}

