/*
 * Programmer: HackOlympus  
 * Date: 30 May 
 * Purpose: Phrase  
 */ 

public class Phrase 
{
    private String currentPhrase ; 
    public Phrase(String a)
    {
        currentPhrase = a ; 
    }

    public void replaceNthOccurrence(String str, int n, String repl)
    {
        String res = ""  ; 
        int index = findNthOccurence(str,n) ; 
        return str.substring(0,n) + repl + str.substring(n) ; 
    }
    
    public int findLastOccurrence(String str)
    {
        n = 1 ; 
        while (findNthOccurence(str,n) != -1){
            n++ ; 
        }
        return n-1 ; 
             
    }
    
    public String  toString() 
    {
        return currentPhrase  ; 
    }

    public static void main(String[] args)
    {
        Phrase phrase1 = new Phrase("Acatatelate."); 
        phrase1.replaceNthOccurrence("at", 1, "rane"); 
        System.out.println(phrase1); 
    }
}

