/*
ID: vishal_7
TASK: gift1 
LANG: C++
*/

#include <bits/stdc++.h>

#define FOR(n) for(int i=0; i < n; i++) 

using namespace std ; 

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    freopen("gift1.in", "r", stdin);
    freopen("gift1.out", "w", stdout);
    
    // main code:  
    int np , a, b, m_out, m_in;
    string name, giver, taker ; 
    cin >> np ; 
    map<string, int> m ; 
    string names[np] ;  
    // m = {n1: 0 , n2 : 0 .....}
    FOR(np)
    {
        cin >> name ; 
        m[name] = 0 ; 
        names[i] = name ; 
    }
    for (int i=np; i!=0; i--)
    {
        cin >> giver ; 
        cin >> a >> b ;
        if (b == 0) ;
        else 
        {
            m_out = a / b ; 
            m_in  = a % b ; 
            m[giver] = m[giver] + (-1 * a) + m_in ;
            FOR (b)
            {
                cin >> taker ; 
                m[taker] = m[taker] + m_out ; 
            }
        }
    }
    
    
    FOR(np)
    {
        cout << names[i] << " " << m[names[i]] << "\n" ;
    }




    return 0 ; 
}
