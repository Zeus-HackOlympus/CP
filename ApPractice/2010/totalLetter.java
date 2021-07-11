/*
 * Programmer: HackOlympus  
 * Date: 01 Jun 
 * Purpose: totalLetter  
 */ 

import java.util.ArrayList ; 
public class FRQ4_2016 
{
    public static int totalletters(ArrayList<String> wordList)
    {
        int res = 0 ; 
        for (String s: wordList){
            res+= s.length() ; 
        }
        return res ; 
    }
    public static void fill(ArrayList<String> arr)
    {
        String[] array = {"BEACH","BALL"} ; 
        for (String s: array)
        {
            arr.add(s) ; 
        }
    }
    
    public static int basicGapWidth(ArrayList<String> wordlist, int formattedLen)
    {
        return (formattedLen - totalletters(wordlist)) / (wordlist.size()-1)  ;  
    }
    
    public static int leftoverSpaces(ArrayList<String> wordList,int formattedLen) 
    {  /* implementation not shown */  } 

    public static String format(ArrayList<String> wordlist, int formattedLen)
    {
        int leftover = leftoverSpaces(wordlist,formattedLen) ; 
        int gapWidth = basicGapWidth(wordlist, formattedLen) ; 
        String res = "" ; 
        for (int i=0;i<wordlist.size()-1;i++){ 
            res+= wordlist.get(i) ;
            for (int j=0;j<gapWidth;i++)
            {
                res += " " ; 
            }
            if (leftover > 0){
                res+= " " ; 
                leftover-- ; 
            }
        }
        res += wordlist.get(wordlist.size()-1) ; 
        return res ; 
    }

    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<String>() ; 
        fill(arr) ; 

        System.out.println(format(arr,20)) ;  
        
    }
}

