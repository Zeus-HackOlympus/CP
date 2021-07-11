/*
 * Programmer: HackOlympus  
 * Date: 29 May 
 * Purpose: repeatSep  
 */ 

public class repeatseparator 
{
    public static String repeatSeparator(String word, String sep, int n)
    {
        String res = "" ; 
        for (int i=1; i<=n; i++)
        {
            if (i==n) {
                res += word ; 
            }
            
            else { 
                res += word + sep ; 
            }                           
        }
        return res ; 
    }
    public static void main(String[] args){
        System.out.println(repeatSeparator("Word", "X", 3)) ; 
        System.out.println(repeatSeparator("This", "And", 1) ) ; 
    }
}

