/*
 * Programmer: HackOlympus  
 * Date: 27 May 
 * Purpose: test  
 */ 

public class test    
{
    public static void main(String[] args){
        String s = "bac" ;
        for (int i=0 ; i<s.length()-2 ; i++){
            System.out.println(s.substring(i,i+1) + "_" + s.substring(i+2,i+3) ) ; 
            if (s.charAt(i) == 'b' && s.charAt(i+2) == 'b') System.out.println(true) ;  
        }
        System.out.println(false) ;
    }
}

