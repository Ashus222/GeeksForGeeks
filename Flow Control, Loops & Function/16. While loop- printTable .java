Here, we will use while loop and print a number n's table in reverse order.

Example 1:

Input:
1

Output:
10 9 8 7 6 5 4 3 2 1
Example 2:

Input:
2

Output:
20 18 16 14 12 10 8 6 4 2

//User function Template for Java
class Geeks {
	 static void printTable (int n) 
	 {
            int multiplier=10;
            while(multiplier>0)
            {
                System.out.print(multiplier * n +" ");
                multiplier --;
                
            }
       System.out.println();
	 }

}
