/*
ID: vishal_7
TASK: milk2
LANG: C++
*/

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)
#define REP(I,n,a) for(int i=I; i < n; i+=a)

using namespace std ;

int lct, lit, n ; 

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    freopen("milk2.in", "r", stdin);
    freopen("milk2.out", "w", stdout);

    // main code :
    cin >> n ;
    vector<pair<int, int>> v ;
    FOR (n) {
        int x, y ;
        cin >> x >> y ;
        v.push_back(make_pair(x,y)) ;
    }
    sort(v.begin(),v.end()) ;

    int ansarr[n] ; 
    int i = 0, k = 0 ; 
    
    int a1 =v[i].first, a2 = v[i].second ; 
    
    for (int j=0 ; j < n ; j++) { 
        int b1 = v[j].first , b2 = v[j].second ; 
        if (b1 <= a2) {
            a2 = max(a2, b2) ; 
            lct = max(a2-a1, lct) ; 
           // cout << a2 << "\n" ; 
        } else { 
            lit = max(lit, b1 - a2) ; 
            a1 = v[j].first ; 
            a2 = v[j].second ; 
        }
    }

    cout << lct << " " << lit << "\n" ;

    return 0 ;
}
