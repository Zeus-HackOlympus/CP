/**
 * @author      : HackOlympus (zeus@fedora)
 * @file        : Jzzhu and Children
 * @created     : Saturday Jan 29, 2022 01:32:05 IST
 */

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n; i++) 

using namespace std ; 

int n, m ; 

void print(int a[], int x)
{
    int i = 0 ; 
    while (i < x)
    {
        cout << a[i] << " " ; 
        i++ ; 
    }
    cout << endl ; 
}

int main()
{
    cin >> n >> m ;
    int a[n], res[2] = {0,0} ;
    float x ; 
    for (int i=0; i < n; i++) 
    {
        cin >> a[i]  ; 
        x = a[i] / m ; 
        //cout << x << endl ; 
        if (x >= 1 && a[i] >=res[0]){
            res[0] = a[i] ; 
            res[1] = i+1 ; 
        } 
        else if (x == 0 && a[i] >= res[0]){
            res[0] = a[i] ; 
            res[1] = i+1  ; 
        }
    }
    cout << '\n' << res[1] << endl ; 
    

    return 0 ; 
}

