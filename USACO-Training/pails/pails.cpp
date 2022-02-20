/*
ID: vishal_7
TASK: Milk Pails 
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
    freopen("pails.in", "r", stdin);
    freopen("pails.out", "w", stdout);
    
    // main code : 
    int x, y, m ;
    cin >> x >> y >> m ; 
    int ans = 0 ; 
    for (int i=0; i < 1001; i++) {
        if (x * i > m) break ; 
        for (int j=0; j < 1001; j++) {
            int r = (x * i) + (y * j) ; 
            if (r > m) break ; 
            ans = max(ans,r) ; 
        }
    }
    cout << ans << "\n" ; 
    return 0 ; 
}
