/*
 * Programmer: HackOlympus 
 * Date: 21th May 
 * Purpose: withoutX problem
 */

public class withoutX
{
    public static String withoutX(String str)
    {
        if (str.substring(0,1).equals("x") && str.substring(str.length()-1).equals("x")){
            return str.substring(1,str.length()-1) ; 
        }
        else if (str.substring(0,1).equals("x") && !str.substring(str.length()-1).equals("x")){
            return str.substring(1) ; 
        }
        else if (!str.substring(0,1).equals("x") && str.substring(str.length()-1).equals("x")){
            return str.substring(0,str.length()-1) ; 
        }
        else if (str.length() == 1 && str.equals("x")) {return str ;}
        else if (str.length() == 0 ) { return "" ;}
    return str ; 
    }
    public static String withoutXImporved(String str)
    {
        if (str.length() > 0 && str.charAt(0) == 'x') {
         str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
        str = str.substring(0, str.length()-1);
        }
        return str ; 
    }
    public static void main(String[] args)
    {
        System.out.println(withoutX("xHix")) ; 
        System.out.println(withoutX("xHi")) ; 
        System.out.println(withoutX("Hxix")) ;
        
        System.out.println(withoutXImporved("xHix")) ; 
        System.out.println(withoutXImporved("xHi")) ; 
        System.out.println(withoutXImporved("Hxix")) ; 
    }
}
