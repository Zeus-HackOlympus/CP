/**
 * @author      : HackOlympus (zeus@hackolympus)
 * @file        : Increasing Array
 * @created     : Monday Feb 07, 2022 21:18:12 IST
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
    int n ; cin >> n ;
    ll arr[n] ; 
    FOR(n) cin >> arr[i] ; 
    ll ans = 0 ; 
    
    for (int j=1; j<n; j++) {
        int first = arr[j-1] ; 
        int second = arr[j] ; 
        if (second < first) {
            arr[j] += 1 * (first - second) ; 
            ans+= (first-second) ;     
        }
    }
    cout << ans << "\n" ; 
    return 0 ; 
}


