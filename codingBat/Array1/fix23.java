/*
 * Programmer: HackOlympus  
 * Date: 23 May 
 * Purpose: fix23 program  
 */ 

public class makeLast 
{
    public static int[] fix23(int[] a)
    {    
        int[] c = a ;  
        for (int i=0 ; i<c.length-1 ; i++){
            if (a[i] == 2 && a[i+1] == 3 ) c[i+1] = 0 ; 
        }
        return c ; 
    }
    public static void main(String[] args)
    {
        int[] a = {1,2,3} ;  
        int[] b = fix23(a) ; 
        for (int i=0 ; i < a.length; i++)
        {
            System.out.print(b[i] + " ") ;
        }
        System.out.println() ;
    }
}


