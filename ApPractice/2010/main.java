/*
 * Programmer: HackOlympus  
 * Date: 01 Jun 
 * Purpose: main  
 */ 

import java.util.ArrayList ; 

public class main  
{
    public static void fill(ArrayList<Integer> arr1) 
    {
        int[] arr = {1,2,2,3,4,5} ; 
        for (int i: arr)
        {
            arr1.add(i) ;  
        }
    }
    public static void show(ArrayList<Integer> arr)
    {
        for (int i: arr)
        {
            System.out.print(i + "  ") ; 
        }
        System.out.println() ; 
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>() ; 
        fill(arr) ; 
        show(arr) ; 
        int n = arr.size(); 
        // remove elements
        for (int i=0; i<n; i++)
        {
            if (arr.get(i) == 2) {
                arr.remove(i) ; 
                i-- ; 
            }
            n-- ; 
        }
        i=4
        show(arr) ; 

    }
}

