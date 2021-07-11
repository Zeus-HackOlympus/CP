/*
 * Programmer: HackOlympus  
 * Date: 02 Jun 
 * Purpose: main  
 */ 


import java.util.ArrayList ; 
public class main   
{
    public static void main(String[] args)
    {
        ArrayList<Integer> i1  = new ArrayList<Integer>()  ; 
        ArrayList<Integer> i2 = new ArrayList<Integer>() ; 
        ArrayList<Integer> e3 = new ArrayList<Integer>() ; 
        int[] a = {1,2,3,4,5,6,7,8,9,10} ; 
        int[] b = {5,6,7,8,9,10,11,12} ; 

        for (int i: a)
        {
            i1.add(i) ; 
        }
        for (int i: b )
        {
            i2.add(i) ; 
        }

        for (Integer e1:i1)
        {
            boolean flag = true ; 
            for (Integer e2: i2)
            {
                if (e1>=e2) flag = false ; 
            }
        
        if (flag) e3.add(e1) ; 
        }
        for (int i: e3){
            System.out.print(i) ; 
        }    
    }
}


