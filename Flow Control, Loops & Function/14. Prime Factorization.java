Given a number N find the prime factorization of the number.

Example 1:

Input:
N = 100
Output:
2 2 5 5
Explanation:
100 = 2 * 2 * 5 * 5
 

Example 2:

Input:
N = 27
Output:
3 3 3
Explanation:
27 = 3 * 3 * 3


public static boolean isPrime( int n){
        for(int i = 2;i<n;i++){
            if (n % i == 0){
                return false;
            }
            
        }return true;
    }
public static void printPrimeFactorization(int n){
    
    for(int i = 2 ;i<n;i++){
        if(isPrime(i)){
            int x = i;
            
            while (n % x == 0){
                System.out.print( i+" ");
                x= x * i;
            }
        }
    }
    
}
