Given an integer N. Write a program to return the factorial of N.
Note: 0 factorial is equal to 1.

Example 1:

Input:
N = 10
Output: 
3628800
Explanation:
1*2*3*4*5*6*7*8*9*10 = 3628800 .
Your Task:
The input N is provided as a parameter to the function nFactorial. 
Complete the given code so that it returns the factorial of N. The output is printed by the driver code.

public static int nFactorial(int n){
    int ans = 1;
    
    while (n > 0){
        ans  = ans *n;
        n-- ;
    }
    
    return ans;
}
