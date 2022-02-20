/**
 * @author      : HackOlympus (zeus@hackolympus)
 * @file        : x
 * @created     : Friday Feb 18, 2022 16:29:35 IST
 */

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)

using ll = long long;

using namespace std ; 

string getBase(int n, int b) 
{
    string res = "" ; 
    while (n) {
        int r = n % b ; 
        n/=b ; 
        res = res + (char)('0' + r);
    }
    reverse(res.begin(),res.end()) ; 
    return res ; 
}

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);    
    // main code : 
    cout << getBase(1337,2) ;      
    return 0 ; 
}


