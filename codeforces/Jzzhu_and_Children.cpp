/**
 * @author      : HackOlympus (zeus@hackolympus)
 * @file        : Jzzhu_and_Children
 * @created     : Tuesday Feb 15, 2022 22:35:33 IST
 */

#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)
#define REP(I,n,a) for(int i=I; i < n; i+=a) 

using ll = long long;

using namespace std ; 

void showq(queue<int> oq)
{
    queue<int> q = oq ; 
    cout << "queue : " ; 
    while (!q.empty()){
        cout << q.front() << " " ; 
        q.pop() ; 
    }
    cout << "\n" ; 
}

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    // main code : 
    int n, m ; 
    cin >> n >> m ; 
    queue<int> q ; 
    FOR(n) {
        int x ; 
        cin >> x ; 
        q.push(x) ; 
    }
    while (q.size() != 1) {
        int x = q.front() - m ; 
        if (x <= 0) {
            q.pop() ; 
            showq(q) ; 
        } else {
            q.pop() ; 
            q.push(x) ;
            showq(q) ; 
        }
    }
    cout << q.front() << "\n" ; 

    return 0 ; 
}


