/*
 * Programmer: HackOlympus  
 * Date: 31 May 
 * Purpose: 2007_selfDivisor  
 */ 

public class test  
{
    public static boolean isSelfDivisor(int num)
    {
        int newNum = num ; 
        while (newNum > 0) {
            int div = newNum % 10 ; // take last digit
            // updating new num to remaining digits
            newNum = (int) newNum / 10 ;  
            // System.out.println("Testing " + num +"/"+div) ; 
            if (num % div != 0 ) return false ;        
        }
        return true ; 
    }
    
    public static int[] firstNumSelfDivisor(int start, int num) 
    {
        int[] arr = new int[num] ; 
        int i = start ;  
        int j  = 0 ;  
        while (j < num )
        {
            i++ ; 
            if (isSelfDivisor(i)) {
                arr[j] = i ; 
                j++ ; 
            }
        }
        return arr ; 
    }
    public static void main(String[] args){
        System.out.println(isSelfDivisor(26)) ;  
        int[] arr = firstNumSelfDivisor(10,3) ; 
        for (int i: arr){
            System.out.print(i + " ") ; 
        }
        System.out.println() ; 
    }
}

