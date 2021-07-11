Question : 1 
(A part)
Write the static method `numberOfLeapYears`, **which returns the number of leap years between year1 and year2**, inclusive. 
In order to calculate this value, a helper method is provided for you. 

`isLeapYear(year)` 
returns: 
    - true if year is a leap year 
    - false otherwise

(A part) 

public static int numberOFLeapYears(int year1, int year2)
{
    int c = 0 ; 
    for (int i=year1; i <= year2; i++){
        if (isLeapYear(i)) c++ ; 
    }
    return c ; 

}

(b part) 

make dayOfWeek(int month, int day, int year)

example: 
dayOfWeek(1, 5, 2019) returns 6

above argument denotes 5 jan 2019. 1 jan 2019 was tuesday so from here 5 jan 2019 was saturday so in int it returns 6

```
firstDayOfYear(year) - return first day(sunday[0],monday[1] etc) of year 
dayOfYear(month, day, year) - return number of day of the year
```


public static int dayOfWeek(int month, int day, int year)
{
    // first we calc first day of year
    int fdy = firstDayOfYear(year) ; // 2 - tues  
    int doy = dayOfYear(month, day, year) ;  // 5 
    
    int res = fdy ; // 6 - sat  
    
    for (int i=fdy; i<=doy; i++){ // i = 6 ; 6 <= 5 F   
        res++ ; // 6 - sat
        if (res == 7) res = 0 ;  
    } 
    return res ; // returns 6 
}
