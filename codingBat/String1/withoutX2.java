public class withoutX2
{
    public static String withoutX2(String str)
    {
        if (str.length() >= 2){
            if (str.substring(0,1).equals("x") && str.substring(1,2).equals("x")) return str.substring(2) ; 
            else if (str.substring(0,1).equals("x") && !str.substring(1,2).equals("x") ) return str.substring(1) ; 
            else if (!str.substring(0,1).equals("x") && str.substring(1,2).equals("x") ) return str.substring(0,1) + str.substring(2,str.length()) ; 
        }
        else if (str.length() == 1 && str.equals("x") ) return "" ;    
    return str ; 
    }
    public static void main(String[] args)
    {
        System.out.println(withoutX2("xHi")) ;
        System.out.println(withoutX2("Hxi")) ; 
        System.out.println(withoutX2("Hi")) ; 
    }
}
