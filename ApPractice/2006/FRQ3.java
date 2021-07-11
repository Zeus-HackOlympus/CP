/*
 * Programmer: HackOlympus  
 * Date: 31 May 
 * Purpose: FRQ3  
 */ 

public class Customer
{
    private String name  ; 
    private int IdNum ; 
    // constructs a customer with given name and Id num
    public Customer(String name, int IdNum)
    {   /* Implementation not show */  
        this.name = name; 
        this.IdNum = IdNum ; 
    }
    
    // returns customers name  
    public String getName() 
    { /*Implementation not shown*/ 
        return name ; 
    }
    
    public int getID()
    {/*Implementation not shown*/
        return IdNum ; 
    }
    
    public int compareCustomer(Customer other)
    {
        String otherName = other.getName() ; 
        int otherID = other.getID() ; 
        String name = getName() ; 
        int ID = getID() ; 

        if (name.equals(otherName)) {
            if (ID > otherID) return 1 ; 
            else if (ID < otherID) return -1 ; 
            else if (ID == otherID) return 0 ; 
        } 
        else if (name.compareTo(otherName) > 0) return 1 ; 
        else  return -1 ;  
    }
    public static void main(String[] args){
        Customer c1 = new Customer("Smith", 1001); 
        Customer c2 = new Customer("Anderson", 1002);   
        Customer c3 = new Customer("Smith", 1003);

        System.out.println(c1.compareCustomer(c1)) ;
        System.out.println(c1.compareCustomer(c2)) ;
        System.out.println(c1.compareCustomer(c3)) ;



    }
}

