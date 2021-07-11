/*
 * Programmer: HackOlympus  
 * Date: 29 May 
 * Purpose: prefixAgain  
 */ 

public class prefixAgain    
{
    public static boolean prefixAgain(String str, int n) 
    {
        String pre = str.substring(0,n) ; 
        for (int i=pre.length(); i<str.length()-pre.length()+1 ; i++){
            if (str.substring(i,i+pre.length()).equals(pre)) return true ;  
        }
        return false ; 
    }
    public static void main(String[] args){
        System.out.println(prefixAgain("abXYabc", 1)) ; 
        System.out.println(prefixAgain("abXYabc", 2)) ; 
        System.out.println(prefixAgain("abXYabc", 3)) ; 
    }
}

