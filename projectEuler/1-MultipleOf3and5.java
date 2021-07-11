/*
 * Programmer: HackOlympus  
 * Date: 25 May 
 * Purpose: 1-MultipleOf3and5  
 */ 

public class project_euler_multiple_of_3_and_5
{
    public static void main(String[] args)
    {
        int sum = 0 ;
        for (int i=0; i<1000; i++)
        {
             
            if (i%3 == 0 || i%5==0){
                sum += i ; 
            }
        }
        System.out.println(sum) ; 
    }
}


