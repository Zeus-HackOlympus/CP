/*
 * Programmer: HackOlympus  
 * Date: 29 May 
 * Purpose: StringChecker  
 */ 

public class CodeWordChecker implements StringChecker 
{
    private int min ; 
    private int max ; 
    private String omit ; 

    public CodeWordChecker(int min, int max, String omit)
    {
        this.min = min ; 
        this.max = max ; 
        this.omit = omit ; 
    }

    public CodeWordChecker(String omit)
    {
        this.min = 5 ; 
        this.max = 20 ; 
        this.omit = omit ; 
    }

    public boolean isValid(String check)
    {
        if (check.length() < min || check.length() > max) return false ; 
        for (int i=0; i<check.length()-omit.length()+1; i++){
            if (check.substring(i,i+omit.length()).equals(omit)) return false ; 
        }
        return true ; 
    }
    public static void main(String[] args){
        StringChecker sc1 = new CodeWordChecker(5, 8, "$"); 
        System.out.println(sc1.isValid("happy")  ) ; 
        System.out.println(sc1.isValid("happy$")) ; 
        System.out.println(sc1.isValid("Code")) ; 
        System.out.println(sc1.isValid("happyCode")) ; 
    }
}


