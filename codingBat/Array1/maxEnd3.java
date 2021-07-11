/*
 * Programmer: HackOlympus  
 * Date: 22 May 
 * Purpose: maxEnd3 problem  
 */ 

public class maxEnd3 
{
    public static int max(int[] a)
    {
        int max = a[0] ; 
        for (int i = 0 ; i<a.length ; i++) {
            if (a[i] > max){
                max = a[i] ; 
            }
        }
        return max ; 
    }

    public static int[] maxEnd3(int[] a)
    {
        int maxNum = max(a) ;
        int[] b = new int[a.length] ; 
        for (int i = 0 ; i<a.length ; i++)
        {
            b[i] = maxNum ; 
        }
        return b ; 
    }
    public static void main(String[] args)
    {
        int[] a = {1,2,3} ; 
        int[] b = maxEnd3(a) ; 
        
        for (int i=0; i<b.length; i++){   
            System.out.print(b[i] + " ") ;
            
        }
        System.out.println() ;
    }
}


