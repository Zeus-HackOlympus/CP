/*
ID: vishal_7
TASK: palsquare 
LANG: C++
*/

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)
#define REP(I,n,a) for(int i=I; i < n; i+=a) 

using namespace std ; 

bool isPalindrome(string n) ; 
string getBase(int n,int b) ; 

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    freopen("palsquare.in", "r", stdin);
    freopen("palsquare.out", "w", stdout);
    
    // main code : 
    int b ; 
    cin >> b ; 
    for (int i=1; i <= 300; i++) {
        if (isPalindrome(getBase(i*i, b))) {
            cout << getBase(i,b) << " " << getBase(i*i,b) << "\n"; 
        }
    }
    return 0 ; 
}

bool isPalindrome(string n) 
{
    string p = n ; 
    reverse(p.begin(),p.end()) ; 
    if (p == n) return true ; 
    else return false ; 
}

string getBase(int n, int b) 
{
    string res = "" ; 
    while (n) {
        int r = n % b ; 
        n/=b ; 
        if (r <= 9 && r >= 0) res = res + (char)('0' + r);
        else if (r > 9) res = res + (char)('A'+(r-10)) ; 
    }
    reverse(res.begin(),res.end()) ; 
    return res ; 
}


