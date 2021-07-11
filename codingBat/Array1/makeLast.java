/*
 * Programmer: HackOlympus  
 * Date: 23 May 
 * Purpose: makeLast program  
 */ 

public class makeLast 
{
    public static int[] makeLast(int[] a)
    {   
        int[] c = new int[2*a.length] ; 
        for (int i=0 ; i<c.length ; i++){
            if (i == c.length - 1) c[i] = a[a.length-1] ; 
            else{ c[i] = 0 ; }
           
        }
        return c ; 
    }
    public static void main(String[] args)
    {
        int[] a = {4,5,6} ; 
        int[] b = makeLast(a) ; 
        for (int i=0 ; i < b.length; i++)
        {
            System.out.print(b[i] + " ") ;
        }
        System.out.println() ;
    }
}


