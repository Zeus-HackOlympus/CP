/*
 * Programmer: HackOlympus  
 * Date: 30 May 
 * Purpose: FRQ1-parta  
 */ 

public class FRQ1_parta   
{

    public boolean conflictsWith(Appointment other)
    { 
        other = new Appointment() ; 
        TimeInterval a = new TimeInterval() ; 
        return (a.overlapsWith(other.getTime())) ;
    }
    public static void main(String[] args){

    }
}

