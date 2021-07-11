/*
 * Programmer: HackOlympus  
 * Date: 30 May 
 * Purpose: scramble  
 */ 

public class scramble  
{
    public static String scrambleWord(String word)
    {
        String s = ""  ;
        if (word.length()==0) return word ; 
        for(int i=0; i<word.length()-1; i++){
            if (word.substring(i,i+1).equals("A") && !word.substring(i+1,i+2).equals("A")){
                s+= word.substring(i+1,i+2) ;
                s+= "A" ; 
                i+=2; 
            }
            else{
                s+=word.substring(i,i+1) ;
                  
            }
        }
        return s + word.substring(word.length()-1) ; 
    }
    public static void main(String[] args){
        System.out.println(scrambleWord("TAN"))  ;
        String res = "TNA" ; 
        System.out.println(res.equals(scrambleWord("TAN"))) ; 
    }
}

