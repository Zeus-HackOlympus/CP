/**
 * @author      : HackOlympus (zeus@hackolympus)
 * @file        : Number Spiral2
 * @created     : Wednesday Feb 09, 2022 13:56:46 IST
 */

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)
#define REP(I,n,a) for(int i=I; i < n; i+=a) 

using ll = long long;

using namespace std ; 

void solve() ; 

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0) ; 
    // main code : 
    int t; 
    cin >> t ;
    while (t--) {
        solve() ;   
    }
    return 0 ; 
}

void solve()
{
    ll y, x, z, ans ; 
    cin >> y >> x ; 
    z = max(y,x) ; 
    if (y == x && y == 1) cout << "1\n" ; 
    else if (z == y) {
        if (z % 2) {
            
        } else {
        }
    } else {
        if (z % 2) {

        } else {

        }
    }
}
