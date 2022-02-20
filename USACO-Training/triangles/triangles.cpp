/*
ID: vishal_7
TASK: triangles 
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
    freopen("triangles.in", "r", stdin);
    freopen("triangles.out", "w", stdout);
    
    // main code : 
    int n; 
    cin >> n ; 
    int x[n], y[n] ; 
    // one side parellel to x axis 
    // other side parelled to y axis 
    int x1 = 0 , x2 = 0 , x3 = 0 , y1 = 0 , y2 = 0 , y3 = 0 ;
    int area = 0 ; 
    FOR(n) cin >> x[i] >> y[i] ; 
    
    for (int i=0; i < n; i++) { 
        for (int j=i+1; j < n; j++) {
            for (int k=j+1; k < n; k++) {
                if (y[j] == y[k] && x[i] == x[j] && y[i] > y[j] && x[k] > x[j])  {
                    x1 = x[i]; //max(x1, x[i]) ; 
                    x2 = x[j]; //max(x2, x[j]) ; 
                    x3 = x[k]; //max(x3, x[k]) ;
                    y1 = y[i]; //max(y1, y[i]) ;
                    y2 = y[j]; //max(y3, y[k]) ;
                    y3 = y[k]; //max(y2, y[j]) ; 
                    area = max(area,(abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)) / 2)) ; 
                    cout << x1 << " " << x2 << " "  << x3 << " " << y1 << " " << y2 << " " << y3 << "\n" ;   
                }
            }
        }
    }
    
    cout << area * 2 << "\n" ; 
    return 0 ; 
}
