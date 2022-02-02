/*
ID: vishal_7
TASK: friday 
LANG: C++
*/

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)


using namespace std ; 

int nyr[] = {31,28,31,30,31,30,31,31,30,31,30,31} ; 

int isleap(int y)
{
    if (y % 100 == 0 && y % 400 == 0)
    {
        return 1 ; 
    }
    // NOTE: due to this y % 100 condition ans was correct else it was coming wrong 
    else if (y % 100 && y % 4 == 0) 
    {
        return 1 ; 
    }
    else return 0 ; 
}

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    freopen("friday.in", "r", stdin);
    freopen("friday.out", "w", stdout);

    // main code : 
    // 0 - monday... 6 - sunday
    int n, y, m, day = 5 ;
    int tally[7] ; 
    fill(tally, tally + 7, 0) ; 
    cin >> n ; 
    int leap = 0 ; 
    for (y=1900; y < 1900 + n ; y++) 
    {
        for (m=0; m < 12; m++)
        {   
            tally[day]++ ; 
            if (m==1) leap = isleap(y) ;  
            else leap = 0; 
            day += leap + nyr[m] ; 
            day = day % 7 ; 
        }
    }
    cout << tally[5] << " " << tally[6] << " "  ;
    for (int i=0; i < 5; i++) 
    {
        if (i != 4) cout << tally[i] << " " ; 
        else cout << tally[i] << "\n" ; 
    }
    return 0 ; 
}
