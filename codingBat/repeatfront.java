/*
 * Programmer: HackOlympus  
 * Date: 29 May 
 * Purpose: repeatfront  
 */ 

public class repeatfront  
{
    public static String repeatFront(String str, int n)
    {
        String res = "" ; 
        for (int i=0; i<n; i++){
            res += str.substring(0,n-i) ; 
        }
        return res ; 
    }
    public static void main(String[] args){
        System.out.println(repeatFront("Chocolate", 4)) ; 
    }
}

