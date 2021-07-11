/*
 * Programmer: HackOlympus  
 * Date: 23 May 
 * Purpose: has23 program  
 */ 

public class has23
{
    public static boolean has23(int[] a)
    {
        for (int i=0; i<a.length ; i++) 
        {
            if (a[i] == 2 || a[i] == 3){
                return true ; 
            }
        }
        return false ; 
    }
    public static void main(String[] args)
    {
        int[] a = {2,5} ; 
        int[] b = {4,5} ; 
        System.out.println(has23(a)) ; 
        System.out.println(has23(b)) ; 
    }

}


