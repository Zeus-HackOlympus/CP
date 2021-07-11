/*
 * Programmer: HackOlympus  
 * Date: 29 May 
 * Purpose: WordPairList  FRQ 2 
 */ 

import java.util.ArrayList ; 

public class WordPairList
{
    private ArrayList<WordPair> allPairs ; 
    
    public WordPairList(String[] words)
    {
        for (int i=0; i<words.length; i++) {
            for (int j=i+1; j < words.length; j++) {
                allPairs.add(new WordPair(word[i],word[j])) ; 
            }
        }
    }
    public void print()
    {
        for (String s: allPairs){
            System.out.println(s) ; 
        }
    }
}

