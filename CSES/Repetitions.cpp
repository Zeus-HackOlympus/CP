/**
 * @author      : HackOlympus (zeus@hackolympus)
 * @file        : Repetitions
 * @created     : Monday Feb 07, 2022 18:44:18 IST
 */

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)
#define REP(I,n,a) for(int i=I; i < n; i+=a) 

using ll = long long;

using namespace std ; 

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    // main code : 
    string s ; 
    cin >> s ;
    char now = s[0] ; 
    ll c=0,ans=0; 
    for (char x : s) {
        if (x == now) {
            c++ ;
        }
        else {
            now = x ; 
            c = 1; 
        }
        ans = max(ans,c) ; 
    }
    cout << ans << "\n" ;
    return 0 ; 
}


