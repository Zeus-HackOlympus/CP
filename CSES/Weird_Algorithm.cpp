/**
 * @author      : HackOlympus (zeus@hackolympus)
 * @file        : Weird Algorithm
 * @created     : Monday Feb 07, 2022 13:52:58 IST
 */

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)
#define REP(I,n,a) for(int i=I; i < n; i+=a) 

using ll = long long; 
using ull = unsigned long long ; 

using namespace std ; 


int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    // main code :
    ull n ; cin >> n ; 
    cout << n << " " ; 
    while (n > 1){
        if (n%2) {
            n = n*3 + 1 ; 
            cout << n << " " ;  
        }
        else if (n % 2 == 0) {
            n = n / 2 ; 
            cout << n << " " ; 
        }
    }
    return 0 ; 
}


