/**
 * @author      : HackOlympus (zeus@hackolympus)
 * @file        : rotate90
 * @created     : Saturday Feb 26, 2022 23:07:26 IST
 */

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)

using ll = long long;

using namespace std ; 


int n ; 
char matrix[11][11], temp[11][11] ; 
void display(char matrix[][11]) ;
void rotate90() ; 

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);    
    // main code : 
    cin >> n ;  
    
    for (int R=0; R < n ; R++) {
        for (int C=0 ; C < n ; C++) {
            char c; cin >> c ; 
            matrix[R][C] = c ; 
        }
    }
    
    memcpy(temp, matrix, sizeof(matrix)) ; 
    rotate90() ; 
    display(temp) ; 
    return 0 ; 
}

void display(char matrix[][11]) 
{
    for (int R=0; R < n ; R++) {
        for (int C=0 ; C < n ; C++) { 
            cout << matrix[R][C] << " " ; 
        }
        cout << "\n" ; 
    }
}

void rotate90()
{
    for (int i=0; i < n; i++) {
        for (int j=0; j < n; j++) {
            int x = j ; 
            int y = n - i - 1 ; 
            temp[x][y] = matrix[i][j] ; 
        }
    }
}



