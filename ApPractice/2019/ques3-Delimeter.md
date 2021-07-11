A string containing text and possibly delimiters has been split into tokens and stored in String[] tokens. 

Each token is either an open delimiter, a close delimiter, or a substring that is not a delimiter. 

You will write the method getDelimitersList, which returns an ArrayList containing all the open and close delimiters found in tokens in their original order.


part A 

```java
public ArrayList<String> getDelimitersList(String[] tokens)
{
    ArrayList<String> res = new ArrayList<String>() ; 
    for (String s: tokens){
        if (s.equals(openDel) || s.equals(closeDel)){
            res.add(s) ; 
        }
    }
    return res ; 
}
```


part b 


```java
public boolean isBalanced(ArrayList<String> delimiters)
{
    int open = 0 ; 
    int close = 0 ; 

    for (String s: delimiters){
        if (s.equals(openDel)) open++ ; 
        else if (s.equals(closeDel)) close++ ; 
        if (close > open) return false ; 
    }
    if (open == close) return true ; 
    return false ; 
}

```

