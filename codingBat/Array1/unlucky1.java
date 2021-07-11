/*
 * Programmer: HackOlympus  
 * Date: 24 May 
 * Purpose: unlucky1 problem   
 */ 

public class unlucky1
{
    public static boolean unlucky1(int[] a) {
        for (int i = 0; i < a.length-1 ; i++){
            if (a[i] == 1 && a[i+1] == 3) return true ;
        }
        return false ;
    }
    public static void main(String[] args){
        int[] c = {1,1,1,3,1} ; 
        System.out.println(unlucky1(c)) ; 
    }
}



