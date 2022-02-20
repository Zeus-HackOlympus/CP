/**
 * @author      : HackOlympus (zeus@hackolympus)
 * @file        : diamond
 * @created     : Thursday Feb 10, 2022 19:31:37 IST
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
    
    freopen("diamond.in","r",stdin) ; 
    freopen("diamond.out","w",stdout) ;  

    // main code : 
    int n, k ;
    cin >> n >> k; 
    int arr[n]; 
    int ans = 0 ; 
    for (int i=0; i<n; i++) cin >> arr[i] ; 
    int x2 = 0 ; 
    for (int i=0 ; i < n; i++) {
        for (int j=0; j < n; j++) {
            if (arr[j] >= arr[i] && arr[j] - arr[i] > k) {
                 x2++ ; 
            }
        }
    }
    cout << x2 << " " << n << "\n" ;
    
    return 0 ; 
}


