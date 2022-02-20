/*
ID: vishal_7
TASK: dualpal 
LANG: C++
*/

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)
#define REP(I,n,a) for(int i=I; i < n; i+=a) 

using namespace std ; 

string getbase(int n, int b) ; 
bool ispalindrome(string s) ; 
bool ispalindromenum(string s) ; 
int _stoi(string s) ; 

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    freopen("dualpal.in", "r", stdin);
    freopen("dualpal.out", "w", stdout);
    
    // main code : 
    int N, S ; 
    cin >> N >> S  ;
    S++ ; 
    while (N) {
        int cnt = 0 ; 
        for (int i=2; i <= 10; i++) {
            if (ispalindrome(getbase(S,i))) {
                cnt++ ;
            }  
            if (cnt == 2) {
                cout << S << "\n" ; 
                N-- ;
                break ; 
            }
        }
        S++ ; 
    }
    return 0 ; 

}

int _stoi(string s)  // string to int
{
   int x = 0 ; 
   for (char c: s) {
       int n = c - '0' ; 
       x = 10 * x + n ; 
   }
   return x ; 
}

bool ispalindromenum(string s) 
{
    int nn = _stoi(s) ; int x = nn ; 
    int n = 0 ; 
    while (nn) {
        int r = nn % 10 ; 
        n = 10 * n + r ; 
        nn/=10 ; 
    }
    if (x == n) return true ; 
    return false ; 
}

bool ispalindrome(string s) 
{
    string sn = s ; 
    reverse(s.begin(),s.end()) ; 
    if (sn == s) return true ; 
    return false ; 
}

string getbase(int n, int b)
{
    string res = "" ; 
    while (n) {
        int x = n % b ; 
        if (x < 10) res += '0' + x ; 
        n/=b ; 
    }
    reverse(res.begin(),res.end()) ; 
    return res ; 
}
