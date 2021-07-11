/*
 * Programmer: HackOlympus  
 * Date: 22 May 
 * Purpose: sum2 problem  
 */ 

public class sum2 
{
    public static int sum2(int[] a)
    {
        int sum = 0 ; 
        if (a.length >= 2){
            return a[0] + a[1] ; 
        }
        for (int i = 0 ; i<a.length ; i++){
            sum += a[i] ; 
        }
        return sum ; 
    }

    public static void main(String[] args)
    {
        int[] a = {1,2,3} ; 
        System.out.println(sum2(a)) ; 
        int[] b = {} ; 
        System.out.println(0 < 0 ) ; 
    }
}

