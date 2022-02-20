/*
ID: vishal_7
TASK: ex-1 
LANG: C++
*/

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)
#define REP(I,n,a) for(int i=I; i < n; i+=a) 

using namespace std ; 

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    freopen("ex-1.in", "r", stdin);
    freopen("ex-1.out", "w", stdout);
    
    // main code : 
    int n ; 
    cin >> n ; 
    int x[n], y[n] ; 
    FOR(n) cin >> x[i] ; 
    FOR(n) cin >> y[i] ; 
    int res = 0 ; 
    for (int i=0; i < n; i++) {
        for (int j=i+1; j < n; j++) {
            int z1 = (x[j] - x[i]) * (x[j] - x[i]) ;  
            int z2 = (y[j] - y[i]) * (y[j] - y[i]) ;
            int r = z2 + z1 ;
            res = max(r,res) ; 
        }
    }
    cout << res << "\n" ;
    return 0 ; 
}
