Given a natural number N. You have to find the number of digits in it.
 

Example 1:

Input:
n = 5534
Output:
4
Explanation: 5534 has 4 digits
Example 2:

Input:
n = 100273
Output:
6
Explanation: 100273 has 6 digits


public static void countDigits(int n){
    
    int count = 0;

    while (n>0){
        n = n/10;
        count+=1 ;
    }
    n = count;
    System.out.print(n);

}
