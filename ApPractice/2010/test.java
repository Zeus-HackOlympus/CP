/*
 * Programmer: HackOlympus  
 * Date: 31 May 
 * Purpose: test  
 */ 


import java.util.ArrayList ; 

public class test  
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,2,3,4,2,5} ; 
        ArrayList<Integer> arrList = new ArrayList<Integer>() ;
        ArrayList<Integer> arr2 = new ArrayList<Integer>() ; 
        // add elements 

        for (int i: arr){
            arrList.add(i) ; 
        }


        // print newly formed arraylist 
        for (int i: arrList) {
            System.out.print(i + " ") ; 
        }
        System.out.println() ; 

        
        // traversing from back 
        for (int i=arrList.size()-1; i >= 0 ; i--) 
        {
            if (arrList.get(i)==2) {
                arrList.remove(i) ;  
            }

        }

        for (int i: arrList)
        {
            System.out.print(i + " " ) ;  
        }
        System.out.println() ;  
    }
}

