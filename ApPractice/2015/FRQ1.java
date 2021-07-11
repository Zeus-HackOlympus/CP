/*
 * Programmer: HackOlympus  
 * Date: 30 May 
 * Purpose: FRQ1  
 */ 

public class FRQ1   
{

    public static int arraySum(int[] arr)
    {
        int sum = 0 ;  
        for (int i: arr){
            sum+=i ; 
        }
        return sum ; 
    }
    

    public static int[] rowSum(int[][] arr)
    {
        int[] result = new int[arr.length]  ; 
        for (int i=0; i<arr.length ; i++){
            int[] oneDarr = new int[arr[i].length] ;
            for (int k=0;k<arr[i].length ; k++){
                oneDarr[k] =  arr[i][k] ; 
            }
            result[i] = arraySum(oneDarr) ; 
        }
        return result; 
    }
    
    public static boolean isDiverse(int[][] arr2D)
    {
        int[] arr = rowSum(arr2D) ; 
        int c = 0 ; 
        for (int i=0; i<arr.length ; i++ ){
            for (int j=i+1; j<arr.length ; j++){
                if (arr[i]==arr[j]) return false ; 
            }
        }
        return true ; 
    }

    public static void main(String[] args){
        int[] arr = {1,3,2,7,3} ;
        int[][] twoDarr = { {1,3,2,7,3}, 
                          {10,10,4,6,2} ,
                          {5,3,5,9,6} ,
                          {7,6,4,2,1} } ; 

        System.out.println(arraySum(arr)) ; 
        int[] test = rowSum(twoDarr) ; 
        for (int s: test){
            System.out.print(s + " ") ; 
        }
        System.out.println() ;

        System.out.println(isDiverse(twoDarr)) ; 
    }
}

