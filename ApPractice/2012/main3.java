/*
 * Programmer: HackOlympus  
 * Date: 02 Jun 
 * Purpose: main3  
 */ 

public class a 
{
    public static int repeatIt(int[] ar) 
    {
        if (ar[0] < 0 || ar[0] >= ar.length) 
        {
            return ar[0] ; 
        }
        else 
        {
            ar[0] += ar[ar[0]] ; 
            return repeatIt(ar) ; 
        }
    }
    public static void main(String[] args)
    {
        int[] ar = {2,1,3,1,3,1,4};  
        System.out.println(repeatIt(ar))  ; 
    }
}

