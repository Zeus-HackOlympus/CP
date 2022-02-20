/*
ID: vishal_7
TASK: namenum 
LANG: C++
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
    freopen("namenum.in","r",stdin) ; 
    freopen("namenum.out","w",stdout) ; 
    string n, line, tstr ; 
    cin >> n ; 
    ifstream fin("dict.txt") ; 
    bool found = false ; 
    while (true) {
        tstr = "" ; 
        fin >> line ;
        if (fin.eof()) break ; 
        for (char c: line) { 
            int x = c - 'A'  ; 
            if (x < 3) tstr += '2' ; 
            else if (x < 6) tstr += '3' ; 
            else if (x < 9) tstr += '4' ; 
            else if (x < 12) tstr += '5' ; 
            else if (x < 15) tstr += '6' ; 
            else if (x < 19) tstr += '7' ; 
            else if (x < 22) tstr += '8' ;
            else tstr += '9' ; 
        }
        if (tstr == n) {
            found = true ; 
            cout << line << "\n" ; 
        }
    }
    if (!found) cout << "NONE\n" ; 
    return 0 ; 
}


