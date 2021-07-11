public class mixstring
{
    public static String mixString(String a, String b){
        String res = "" ; 
        if (b.length() > a.length()) {
            for (int i=0; i<a.length() ; i++){
                res += a.substring(i,i+1) ; 
                res += b.substring(i,i+1) ; 
            }
        }
        else { 
            for (int i=0; i<b.length(); i++) {
                res+= a.substring(i,i+1) ; 
                res += b.substring(i,i+1) ; 
            }      
        }
        if (a.length() < b.length()) return res + b.substring(a.length()) ; 
        return res+a.substring(b.length()) ; 
    }

    public static void main(String[] args)
    {
        System.out.println(mixString("xxx", "X"))  ;
    }
}
