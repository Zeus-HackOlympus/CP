/*
ID: vishal_7
TASK: ride 
LANG: C++
*/

#include <bits/stdc++.h>

#define FOR(n) for(int i=0; i < n; i++) 

using namespace std ; 

int getval(string a)
{
    int res = 1 ;
    for (int i=0; i< a.length();i++)
    {
        res = res * (a[i] % 64) ; 
    }
    return res ;
}

int main()
{
    ofstream fout("ride.out") ; 
    ifstream fin("ride.in") ; 
    string a, b ; 
    fin >> a >> b ; // take input from file 
    int n1 = getval(a) ; 
    int n2 = getval(b) ; 
    if (n1 % 47 == n2 % 47) fout << "GO" << endl ; 
    else fout << "STAY" << endl ; 

    return 0 ;  
}
