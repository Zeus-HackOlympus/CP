#!/usr/bin/env python3 

#train.usaco.org template generator

from string import Template 
import sys 

def get_template(task):
    t = Template("""/*
ID: vishal_7
TASK: $task 
LANG: C++
*/

#include <bits/stdc++.h>

#define FOR(n) for(int i=0; i < n; i++) 

using namespace std ; 

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    freopen("$task_input", "r", stdin);
    freopen("$task_output", "w", stdout);
    int a, b ; 
    cin >> a >> b ; // take input from file 
    cout << a+b << endl ; // print output to a fd 
    return 0 ; 
}
""")
    return t.substitute({'task':task, 'task_input':task.split('.')[0] + '.in','task_output':task.split('.')[0] + '.out'})

def main():
    if (len(sys.argv) != 3 ):
        print("usage: ./make-template.py filename task_name")
        exit(-1)
    
    filename = str(sys.argv[1])
    template = get_template(sys.argv[2])
    with open(filename,'w+') as f :
        f.write(template)
    open(f"{filename.split('.')[0]}.out","w") 
    open(f"{filename.split('.')[0]}.in","w") 
    print("Done!")


main()
