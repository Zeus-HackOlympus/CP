# Question 1 Answers 

## Part A 

```java
public boolean simulate()
{
    int hops = 0 ;  
    for (int i=0; i<maxHops;i++){
        hops += hopDistance() ;
        if (hops < 0) return false ; 
        else if (hops >= goalDistance) return true ; 
    }
    return false ; 
}
```


## Part B 

```java
public double runSimulations(int num)
{
    double success = 0 ; 
    for (int i=0; i<num; i++){
        if (simulate()) success++ ; 
    }
    return double/num  ; 

}

```



