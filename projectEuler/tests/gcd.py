#! /usr/bin/python3 

def gcd(a: int, b: int):
    if (b % a == 1): return 1 
    elif (b % a > 1 ): return gcd(b%a, a)
    else : return a  

print(gcd(4,64))

