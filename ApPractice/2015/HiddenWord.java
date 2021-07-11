/*
 * Programmer: HackOlympus  
 * Date: 30 May 
 * Purpose: HiddenWord  
 */ 

public class HiddenWord    
{
    private String word ;
    public HiddenWord(String word)
    {
        this.word = word ; 
    }

    public String getHint(String str)
    {
        String res = "" ; 
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == word.charAt(i)) res+=str.charAt(i) ; 
            else if (word.indexOf(str.charAt(i)) >= 0) res+= "+" ; 
            else if (word.indexOf(str.charAt(i)) == -1 ) res += "*" ; 
        }
        return res ; 
    }

    public static void main(String[] args)
    {
        HiddenWord puzzle = new HiddenWord("HARPS"); 
        System.out.println(puzzle.getHint("HARPS"))  ; 
    }
}

