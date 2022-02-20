/*
ID: vishal_7
TASK: paint 
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
    freopen("paint.in", "r", stdin);
    freopen("paint.out", "w", stdout);
    
    // main code : 
    int a,b,c,d ; 
    cin >> a >> b ; 
    cin >> c >> d ;  
    int x = max(b,d) ; 
    int y = min(a,c) ; 
    cout << max(x-y, y-x) << "\n" ;
    return 0 ; 
}
