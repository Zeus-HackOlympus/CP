/**
 * @author      : HackOlympus (zeus@fedora)
 * @file        : Amusing Joke
 * @created     : Wednesday Jan 26, 2022 13:05:31 EST
 */

#include <bits/stdc++.h>

using namespace std ; 

string sortString(string s) ; 

int main()
{
    string s, t, l ;
    cin >> s >> t >> l ;
    s = sortString(s+t) ;
    l = sortString(l) ; 
    int i ; 
    for (i=0; i < s.length() && s[i] == l[i] ; i++) ; 
    if (i != s.length()-1) cout << "NO" ; 
    else cout << "YES" ; 
    return 0 ; 
}

string sortString(string s)
{
    for (int j=0; j < s.length(); j++)
    {
        for (int i=0; i < s.length()-1; i++)
        {
            if (s[i] > s[i+1]) 
            {
                char t = s[i] ; 
                s[i] = s[i+1] ; 
                s[i+1] = t ; 
            }
        }
    }
    return s ; 
}
