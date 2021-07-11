/*
 * Programmer: HackOlympus  
 * Date: 23 May 
 * Purpose: middleWay program  
 */ 

public class middleWay 
{
    public static int[] middleWay(int[] a, int[] b)
    {
        int[] c = {a[(int)(a.length/2)],b[(int)(b.length/2)]} ; 
        return c ; 
    }
    public static void main(String[] args)
    {
        int[] a = {1,2,3} ; 
        int[] b = {4,5,6} ; 
        int[] c = middleWay(a,b) ; 
        for (int i=0; i < c.length ; i++) {
            System.out.print(c[i] + " ") ; 
        } 
        System.out.println() ; 
    }
}



