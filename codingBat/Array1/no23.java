/*
 * Programmer: HackOlympus  
 * Date: 23 May 
 * Purpose: no23 program  
 */ 

public class no23
{
    public static boolean no23(int[] a)
    {
        for (int i=0; i<a.length ; i++) 
        {
            if (a[i] == 2 || a[i] == 3){
                return false ; 
            }
        }
        return true ; 
    }
    public static void main(String[] args)
    {
        int[] a = {2,5} ; 
        int[] b = {4,5} ; 
        System.out.println(no23(a)) ; 
        System.out.println(no23(b)) ; 
    }

}


