TheSparseArray class represents a sparse array. It contains a list of SparseArrayEntry objects. 

```java
public static int getValueAt(int row, int col)
{

    for (SparseArrayEntry e: entries){
        if (e.getRow() ==r && e.getCol() == c) {
            return e.getValue() ; 
        } 
    } 
    return 0 ; 
}
```


```java



```

