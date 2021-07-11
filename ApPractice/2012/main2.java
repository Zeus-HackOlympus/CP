/*
 * Programmer: HackOlympus  
 * Date: 02 Jun 
 * Purpose: main2  
 */ 

public class a   
{
    public static String changeIt(String str, int x)
    {
        if (x<=0|| str.length()<2)
        {
            return "Q" ; 
        }
        String a = str.substring(0,2) ; 
        String b = str.substring(2) ;
        System.out.println(x + " ") ; 
        return changeIt(a,x-1) + b ; 
    }
    public static void main(String[] args)
    {
        System.out.println(changeIt("walrus",3)) ; 
    }
}

