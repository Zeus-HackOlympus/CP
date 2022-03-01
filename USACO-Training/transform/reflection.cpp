/**
 * @author      : HackOlympus (zeus@hackolympus)
 * @file        : reflection
 * @created     : Tuesday Mar 01, 2022 12:15:01 IST
 */

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)

using ll = long long;

using namespace std ; 

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);    
    // main code : 
    int m[11][11], t[11][11], n ;
    cin >> n ; 
    for (int i=0 ; i < n; i++) {
        for (int j=0 ; j < n ; j++) {
            int n; cin >> n ; 
            m[i][j] = n ; 
        }
    }
    

    for (int i=0; i < n; i++) {
        for (int j=0; j < n; j++) {
            int y = n - j - 1 ; 
            int x = i ;
            t[x][y] = m[i][j] ; 
        }
    }

    for (int i=0; i < n; i++) {
        for (int j=0; j < n; j++) {
            cout << t[i][j] << " " ; 
        }
        cout << "\n" ; 
    }

    return 0 ; 
}


