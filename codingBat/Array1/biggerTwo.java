/*
 * Programmer: HackOlympus  
 * Date: 23 May 
 * Purpose: biggerTwo  
 */ 

public class biggerTwo
{
    public int[] biggerTwo(int[] a, int[] b) {
        if (a[0]+a[1] > b[0] + b[1]) return a ;
        else if (a[0]+a[1] < b[0]+b[1]) return b ;
        else return a ;
    }

}


