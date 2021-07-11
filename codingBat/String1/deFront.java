/*
 * Programmer: HackOlympus 
 * Date: 21th May 
 * Purpose: deFront problem
 */

public class deFront
{
    public static String deFront(String str)
    {   
        if (str.length() >= 2) {
            if (!str.substring(0,1).equals("a") && !str.substring(1,2).equals("b")){
                return str.substring(2) ; 
            }
            else if (str.substring(0,1).equals("a") && !str.substring(1,2).equals("b") ){
                return str.substring(0,1) + str.substring(2) ; 
            }
            else if ( !str.substring(0,1).equals("a") && str.substring(1,2).equals("b") ){
                return str.substring(1) ; 
            } 
        }    
    return str ; 
    }
    public static void main(String[] args)
    {
        System.out.println(deFront("Hello")) ; 
        System.out.println(deFront("java")) ; 
        System.out.println(deFront("away")) ; 
    }
}
