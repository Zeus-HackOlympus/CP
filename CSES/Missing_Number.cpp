/**
 * @author      : HackOlympus (zeus@hackolympus)
 * @file        : Missing Number
 * @created     : Monday Feb 07, 2022 18:31:38 IST
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
    ll n, sum=0 ; 
    cin >> n ; 
    for (ll i=1; i < n; i++) { 
        ll x ; 
        cin >> x ; 
        sum += x; 
    }

    cout << (n*(n+1) / 2) - (sum) << "\n" ; 
    return 0 ; 
}


