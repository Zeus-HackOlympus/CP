/*
 * Programmer: HackOlympus  
 * Date: 30 May 
 * Purpose: Digits  
 */ 

import java.util.ArrayList ; 

public class Digits   
{
    private ArrayList<Integer> digitList ;  
    
    public Digits(int num)
    {
        digitList = new ArrayList<Integer>() ; 
        if (num==0) digitList.add(0) ; 
        else{
            while (num != 0) {
                digitList.add(0,num%10) ;
                num = (int) num / 10 ; 
            }
        }
    }

    public boolean isStrictlyIncreasing() 
    {
        int max = 0 ; 
        for (Integer i: digitList){
            if (i > max) max = i ; 
            else return false ; 
        }
        return true ; 
    }
    public void print()
    {
        for (Integer a: digitList){
            System.out.print(a+ " ") ; 
        }
        System.out.println() ; 
    }
    public static void main(String[] args){
        Digits d1 = new Digits(63310);
        System.out.println(d1.isStrictlyIncreasing()) ;  
    }
}

