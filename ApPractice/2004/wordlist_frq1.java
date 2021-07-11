/*
 * Programmer: HackOlympus  
 * Date: 29 May 
 * Purpose: wordlist FRQ problem 1 
 */ 

import java.util.ArrayList ; 

public class wordlist_frq1
{
    private ArrayList<String> myList ; 
    
    public wordlist_frq1(ArrayList<String> n) 
    {
        myList = n ; 
    }
    public int numWordsOfLength(int len)
    {
        int c = 0 ; 
        for (String s: myList){
            if (s.length() == len) c++ ;  
        }
        return c ; 
    }
    public static void main(String[] args){
        ArrayList<String> n = new ArrayList<String>(); 
        n.add("cat"); 
        n.add("mouse") ; 
        n.add("frog") ; 
        n.add("dog") ; 
        n.add("dog") ; 
        
        wordlist_frq1 animals = new wordlist_frq1(n) ; 
        System.out.println(animals.numWordsOfLength(4)) ;
    }

}


