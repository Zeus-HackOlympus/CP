#!/usr/bin/env python3 

#train.usaco.org template generator

from string import Template 
from os import mkdir
import sys 

def get_template(task):
    t = Template("""/*
ID: vishal_7
TASK: $task 
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
    freopen("$task_input", "r", stdin);
    freopen("$task_output", "w", stdout);
    
    // main code : 

    return 0 ; 
}
""")
    return t.substitute({'task':task, 'task_input':task+ '.in','task_output':task + '.out'})

def main():
    if (len(sys.argv) != 2 ):
        print("usage: ./make-template.py task_name")
        exit(-1)
    
    taskname = sys.argv[1]
    template = get_template(taskname)
    mkdir(taskname)
    with open(f"{taskname}/{taskname}.cpp",'w+') as f :
        f.write(template)
    open(f"{taskname}/{taskname}.out","w") 
    open(f"{taskname}/{taskname}.in","w") 
    print("Done!")


main()
