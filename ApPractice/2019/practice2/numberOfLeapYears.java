/*
 * Programmer: HackOlympus  
 * Date: 31 May 
 * Purpose: numberOfLeapYears  
 */ 

public class numberOfLeapYears    
{
    public static int numberOfLeapYears(int year1, int year2)
    {
        int c = 0 ; 
        for (int i=year1; i<= year2; i++){
            if (isLeapYear(i)) c++ ; 
        }
        return c ; 
    }
    public static void main(String[] args){

    }
}

