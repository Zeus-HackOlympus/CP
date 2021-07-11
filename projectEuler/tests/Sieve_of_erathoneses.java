/*
 * Programmer: HackOlympus  
 * Date      : 10 Jun 
 * Purpose   : Trying to implement Sieve_of_erathoneses  
 *  
 * Sieve of erathoneses is a method which helps us to quickly find prime numbers  
 */ 

import java.util.* ; 
import java.lang.* ; 

class Sieve_of_erathoneses
{
	private boolean[] arr ;  
	
	public Sieve_of_erathoneses(int n)
	{
		// for 0 and 1 they both are considered not prime
		arr = new boolean[n+1] ;
		arr[0] = false ; 
		arr[1] = false ; 
		for (int i=2;i<n;i++)
		{
			arr[i] = true ; 
		}
	}

	public void getPrime()
	{
		for (int i=0;i<arr.length;i++) // i = 2 
		{
			if (arr[i]){ // true 
				for (int j=i;j<arr.length;j+=i) // j = 4 ; T; 
				{
					if (j!=i) arr[j] = false ; // if j = first case which we dont want to be false or else everything will become false  
				}
			}
		}
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]) System.out.print(i + " ") ; 
		}
		System.out.println()  ; 
	}

    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in) ; 
    	System.out.print("Number : ") ; 
    	int n = scan.nextInt() ; 
    	Sieve_of_erathoneses obj = new Sieve_of_erathoneses(n) ;
    	obj.getPrime() ;  
    }
}

