/*
 * Programmer: HackOlympus  
 * Date: 31 May 
 * Purpose: Delimeters  
 */ 

import java.util.ArrayList ; 

public class Delimeters
{
    private String openDel ; 
    private String closeDel ; 

    public Delimeters(String openDel, String closeDel)
    {
        this.openDel = openDel ; 
        this.closeDel = closeDel ; 
    }

    public ArrayList<String> getDelimetersList(String[] tokens)
    {
        /* Part-A */
        ArrayList<String> delList = new ArrayList<String>() ; 
        for (String i: tokens){
            if (i.equals(openDel) || i.equals(closeDel)) delList.add(i) ; 
        }
        return delList ; 
    }

    public boolean isBalanced(ArrayList<String> delimiters)
    {
        /* Part-B */ 
        int open = 0 ; 
        int close = 0 ; 

        for (String i: delimiters){
            if (i.equals(openDel)) {
                open++ ; 
            }
            else if (i.equals(closeDel)){
                close++ ;  
            }
            if (open < close) return false ;   
        }
        if (open == close) return true ; 
        return false ; 
    }
    public static void main(String[] args)
    {
        Delimeters d1 = new Delimeters("<sup>","</sup>") ; 
        String[] arr = {"(","x+y",")"," * 5"} ; 
        
        ArrayList<String> arr1 = new ArrayList<String>() ; 

        arr1.add("<sup>") ; 
        arr1.add("<sup>") ; 
        arr1.add("</sup>") ; 
        //arr1.add("<sup>") ; 
        //arr1.add("</sup>") ;
        //arr1.add("<sup>") ; 

        System.out.println(d1.isBalanced(arr1)) ; 

    }
}

