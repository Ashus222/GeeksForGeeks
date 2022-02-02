Given a positive integer N. Your task is to check if it divisible as given below:
1. If it is divisible by 2, print "Two".
2. If it is divisible by 3, print "Three".
3. If it is divisible by 11, print "Eleven".
4. If not follow above three rules, print "-1".
Note: If N is divisible by more than one of the above given numbers, print the one which is largest.

Example 1:

Input:
3

Output:
Three
Example 2:

Input:
11

Output:
Eleven

class Geeks {
	 static void isDivisibleByPrime (int n) 
	 {
        if (n % 11 == 0) {
        System.out.print("Eleven");
      } else if (n % 3 == 0) {
          System.out.print("Three");
      } else if (n % 2 == 0) {
        System.out.print("Two");
      } else {
        System.out.print("-1");
      }
      
       System.out.println();
	 }
	 
	 /*
	 if(n%11 == 0)
            {
                System.out.print("Eleven");
            }
            else if(n%2 == 0 || n%3 == 0){
                
                //if divisible by 3
                if(n%3 == 0){
                    System.out.print("Three");
                }
                else if(n%2 == 0)//ifdivisible by 2
                {
                   System.out.print("Two");
                }
            }
            else//if not divisible
            {
                System.out.print("-1");
            }
       System.out.println();
	 }*/

}
