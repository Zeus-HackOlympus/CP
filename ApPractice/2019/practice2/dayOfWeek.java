/*
 * Programmer: HackOlympus  
 * Date: 31 May 
 * Purpose: dayOfWeek  
 */ 

/*
 * firstDayOfYear(year)  returns the integer value representing the day of the week for the first day ofyear, where 0 denotes Sunday,
 *
 * dayOfYear(month, day, year) returns n, where month, day, and yearspecify the nth day of the year. For the first day of the year, January 1 (month = 1, day = 1), the value 1 is returned. 
 * This method accounts for whether year is a leap year. For example, dayOfYear(3, 1, 2017) returns 60, since 2017 is not a leap year, 
 * while dayOfYear(3, 1, 2016) returns 61, since 2016 is a leap year  
 * 1 march 2016 so 31 + 29 (leap) + 1 (1st day of march) = 61
 * 1 march 2017 so 31 + 28(not leap) + 1 = 60 
 * so nth day of the year
 *
 * day of week return day at that date 
 */

 

public class dayOfweek
{

    public static int dayOfWeek(int month, int day, int year)
    {
        int fdy  = firstDayOfYear(year) ;  // 2 
        int daynum = dayOfYear(month, day, year) ;  // 5
        int result = fdy ; // 

        for (int i = 1 ; i<=daynum; i++) // i = 5
        {
            result++ ; 
            if (result == 7) result = 0 ; 
        }
        return result ; 
    }
    public static void main(String[] args){

    }
}

