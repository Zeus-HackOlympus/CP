/*
ID: vishal_7
TASK: transform 
LANG: C++
*/

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)
#define REP(I,n,a) for(int i=I; i < n; i+=a) 

using namespace std ; 

int n ; 
char before[11][11], after[11][11], temp[11][11], temp2[11][11] ; 

void initarr() ; 
bool compare(char matrix[][11], char matrix2[][11]) ;  
void rotate90() ; 
void reflection() ; 
void combination(char matrix[][11]) ; 
void display(char matrix[][11]) ; 

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0) ; 
    freopen("transform.in", "r", stdin);
    freopen("transform.out", "w", stdout);
    
    // main code : 
    cin >> n ;  
    initarr() ;
    memcpy(temp2, before, sizeof(before)) ;
    int ans ; 
    for (ans=1; ans<=3; ans++) {
        rotate90() ;
        memcpy(temp2, temp, sizeof(before)) ;
        if (compare(temp, after)) {
            cout << ans << "\n" ; 
            return 0 ; 
        }
    }
    memcpy(temp2, before, sizeof(before)) ; 
    reflection() ; 
    if (compare(temp, after)) {
        cout << ans << "\n" ; // 4 
        return 0 ; 
    } 
    memcpy(temp2, temp, sizeof(temp)) ; 
    ans++ ; // 5 
    for (int i=0; i < 3; i++) {
        rotate90() ;
        memcpy(temp2, temp, sizeof(before)) ;
        if (compare(temp, after)) {
            cout << ans << "\n" ; 
            return 0 ;
        }
    }
    ans++ ; // 6
    if (compare(before,after)) {
        cout << ans << "\n" ; 
        return 0 ; 
    }
    ans++ ; // 7
    cout << ans << "\n" ; 
    return 0 ; 
}

void initarr() 
{
    for (int row=0; row < n; row++) {
        for (int col=0; col < n; col++) {
            char c; cin >> c; 
            before[row][col] = c ; 
        }
    }
    for (int row=0; row < n; row++) {
        for (int col=0; col < n; col++) {
            char c; cin >> c; 
            after[row][col] = c ; 
        }
    } 
}

bool compare(char matrix[][11], char matrix2[][11]) 
{
    int row, col ; 
    for (row=0; row < n; row++) {
        for (col=0; col < n; col++) {
            if (matrix[row][col] != matrix2[row][col])
                return false ; 
        }
    }
    return true ; 
}


void rotate90()
{
    for (int i=0; i < n; i++) {
        for (int j=0; j < n; j++) {
            int x = j ; 
            int y = n - i - 1 ; 
            temp[x][y] = temp2[i][j] ; 
        }
    }
}

void reflection()
{
    for (int i=0; i < n; i++) {
        for (int j=0; j < n; j++) {
            int y = n - j - 1 ; 
            int x = i ;
            temp[x][y] = temp2[i][j] ; 
        }
    }

}
