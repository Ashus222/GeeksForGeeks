Given an integer n check if n is prime or not.
A prime number is a number that is divisible by 1 and itself only.

Example 1:

Input:
n = 17
Output: 
True
Explanation:
17 is  divisible by  only 1 and 17.
So it's a prime number.

public static boolean prime(int n){
    
    if ( n == 1 )
   // System.out.print("False");
    return false;
    
    //if ( n == 2)
    //return true;
    
    
    for (int  i = 2;i*i <= n ;i++){
        if (n % i == 0){
        //System.out.print("False");
        return false;
       } 
    }
    return true;
}
