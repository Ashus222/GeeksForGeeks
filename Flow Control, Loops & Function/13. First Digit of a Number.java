Given a number N, find the first digit of the number.

Example 1:

Input:
N = 123
Output:
1
 

Example 2:

Input:
N = 976
Output:
9

// Complete the function
public static int firstDigit(int n){
    
    while (n >= 10){
        n = n/10;
    }
    return n;
    
}
