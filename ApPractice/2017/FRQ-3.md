Write the Phrase method `replaceNthOccurrence` , which will replace the *nth* occurrence of the string **str** with the string **repl**. If the nth occurrence does not exist,current Phrase remains **unchanged.** 





```java

public class phrase1 
{
    private String currentPhrase ; 
    public phrase1(String a)
    {
        currentPhrase = a ; 
    }

    public void replaceNthOccurrence(String str, int n, String repl)
    {
        String res = ""
        int occ = 0 ; 
        for (int i=0; i<currentPhrase.length()-str.length(); i++){
            if (currentPhrase.substring(i,i+str.length())) {
                occ++ ;
            }
            if (occ == n) { 
                res += currentPhrase.substring(0,i) ; 
                res += repl ; 
                res += currentPhrase.substring(i+str.length()) ; 
            }
            currentPhrase = res ; 
        }
    }
    
    public String  toString() 
    {
        return currentPhrase  ; 
    }
}
```
