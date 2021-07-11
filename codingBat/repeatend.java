/*
 * Programmer: HackOlympus  
 * Date: 29 May 
 * Purpose: repeatend  
 */ 

public class repeatend  
{
    public static String repeatEnd(String str, int n)
    {
        String res = "" ; 
        for (int i=0; i<n; i++){
            res+= str.substring(str.length()-n) ; 
        }
        return res ; 
    }
    public static void main(String[] args)
    {
        System.out.println(repeatEnd("Hello", 3)) ; 
    }
}

