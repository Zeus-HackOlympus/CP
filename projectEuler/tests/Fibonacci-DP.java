/*
 * Programmer: HackOlympus  
 * Date      : 07 Jun 
 * Purpose   : try for fibonacci algorithm using DP   
 */ 

import java.util.* ; 
import java.lang.* ; 
import java.math.* ; 

class fibonacci_DP
{
	private ArrayList<Long> arr = new ArrayList<Long>() ; 
	public fibonacci_DP()
	{
		// TODO: add BigInteger  
		// first added 2 numbers 		
		if (arr.size() == 0) {
			arr.add((long)1) ; 
			arr.add((long)1) ; 
		}
	}
	public long fib(int n)
	{ 
		// if index for n not available 
		if (arr.size()-1 < n){
			for (int i=arr.size(); i!=n;i++){
				long first = arr.get(i-2) ; 
				long second =  arr.get(i-1) ;

				long result = first + second ; 
				arr.add(result) ;  
			}
			return arr.get(n-1) ; 
		}
		return arr.get(n-1) ; 

	}
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in) ; 
    	System.out.print("Number: ") ; 
    	int test = scan.nextInt() ; 
    	fibonacci_DP obj = new fibonacci_DP() ; 
    	System.out.println(obj.fib(test)) ;  

    }
}

