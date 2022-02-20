/**
 * @author      : HackOlympus (zeus@hackolympus)
 * @file        : Permutations
 * @created     : Monday Feb 07, 2022 22:31:12 IST
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
    int n , c ; cin >> n ;
    if (n==1) {
        cout << "1\n" ; 
        return 0 ; 
    }
    else if (n <= 3) {
        cout << "NO SOLUTION" << "\n" ; 
        return 0 ; 
    }
    else {
        for (int i=2; i <= n ; i+=2) cout << i << " " ; // all even number from last 
        for (int i=1; i <= n ; i+=2) cout << i << " " ;  // all odd number from last 
        cout << "\n" ; 
    }
    return 0 ; 
}


