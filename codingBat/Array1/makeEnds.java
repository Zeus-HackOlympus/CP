/*
 * Programmer: HackOlympus  
 * Date: 23 May 
 * Purpose: makeEnds Program  
 */ 

public class makeEnds
{
    public static int[] makeEnds(int[] a)
    {
        int[] b = {a[0],a[a.length-1]} ; 
        return b ; 
    }
    public static void main(String[] args)
    {
        int[] a = {1,2,3} ; 
        int[] b = makeEnds(a) ; 
        for (int i=0 ; i < b.length; i++)
        {
            System.out.print(b[i] + " ") ; 
        } 
        System.out.println() ; 
    }
}



