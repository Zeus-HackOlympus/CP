/*
ID: vishal_7
TASK: beads 
LANG: C++
*/
#include <bits/stdc++.h>

#define FOR(n) for (int i=0; i < n ; i++)
#define REP(I,n,a) for(int i=I; i < n; i+=a) 

using namespace std ; 


int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    freopen("beads.in", "r", stdin);
    freopen("beads.out", "w", stdout);
    
    // main code : 
    int n ; // 2  
    string s; // wwwbbrwrbrbrrbrbrwrwwrbwrwrrb
    
    cin >> n >> s  ;
    /*s = s + s ; // w   wwbbrwrbrbrrbrbrwrwwrbwrwrrb_w wwwbbrwrbrbrrbrbrwrwwrbwrwrrb
    int max = 0 ; 
    bool right_blue ; 
    for(int i=0; i<n; i++)
    {
        int white = 0, blue = 0, red = 0, sum = 0 ;
        
        // start from right side 
                
         for (int j=n+i; j < s.length(); j++)
        {
            if (s[j] == 'w') 
            {
                white++ ; 
            }
            else if (s[j] == 'r' ) 
            {
                if (blue == 0) // blue not found 
                {
                    red += white + 1 ; 
                    white = 0 ;
                } else break ; 
            }
            else if (s[j] == 'b')
            {
                if (red == 0)  // red not found 
                {
                    blue += white + 1 ; 
                    white = 0 ; 
                } else break ;
            }
        }
        if (blue && !red)
        {
            bool right_blue = true ; 
        }
        else 
        {
            bool right_blue = false ; 
        }
        sum = red + blue ; // 5 
        red = 0 ; 
        white = 0 ; 
        blue = 0 ; 
        
        // left side
        for (int j=n+i-1; j>=0; j--)
        {
            if (s[j] == 'w') // wwwbbrwrbrbrrbrbrwrwwrbwrwrr b wwwbbrwrbrbrrbrbrwrwwrbwrwrrb
            {
                white++ ; 
            }
            else if (s[j] == 'r' ) 
            {
                if (blue == 0)
                {
                    red += white + 1 ; 
                    white = 0 ;
                } 
                else if (right_blue && blue > 0 && s[j-1] == 'b')
                {
                    red += white + 1 ; 
                    white = 0 ;  
                }
                else break ; 
            }
            else if (s[j] == 'b')
            {
                if (red == 0) // red not found 
                { 
                    blue += white + 1 ; 
                    white = 0 ; 
                }
                else break ;
            }
        }

        sum += red + blue ; 
        if (sum > max) max = sum ; 
    }
    cout << max << "\n" ; 
    */
    // int max_collected = 0;
    // for (int i = 0; i < n; i++) {
    //     string s1 = s.substr(i + 1, n - i + 1);
    //     string s2 = s.substr(0, i + 1);
    //     reverse(s2.begin(), s2.end());
    //     cout << s1 << " - " << s2 << "\n";  
    // }

    s = s + s;
    int maxcount = 0;
    for (int i = 0; i < n; i++) {
        int start = i;
        int end = n + i - 1;
        int currentcount = 0;
        int j = start;
        while (j <= end && (s[j] == 'w' || s[j] == 'b')) {
            currentcount++;
            j++;
        }   
        while (j <= end && (s[j] == 'w' || s[j] == 'r')) {
            currentcount++;
            j++;
        }
        maxcount = max(maxcount, currentcount);
        currentcount = 0;
        j = start;
        while (j <= end && (s[j] == 'w' || s[j] == 'r')) {
            currentcount++;
            j++;
        }
        while (j <= end && (s[j] == 'w' || s[j] == 'b')) {
            currentcount++;
            j++;
        }
        maxcount = max(maxcount, currentcount);        
    }
    cout << maxcount << "\n";
    return 0 ;     
}


