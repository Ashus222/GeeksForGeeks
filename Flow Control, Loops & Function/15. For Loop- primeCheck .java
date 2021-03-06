Here, we will use for loop and check if the given number n is prime or not.
Note: A number is prime if it's divisible by itself and 1. Also, 1 is not prime.

Example 1:

Input:
1

Output:
No
Example 2:

Input:
2

Output:
Yes

class Geeks {
    static void isPrime(int n) {
        
        boolean flag = false;

        // if n==1
        if (n < 2)
            System.out.print("No");
        else {

            for (int i = 2; i <= Math.sqrt(n); i++) {

                // if n has a factor other than
                // 1 and n itself then making
                // flag true
                if (n % i == 0) {
                    flag = true;
                    break;
                }
            }

            // printing "Yes" if
            // it is prime
            // else "No"
            if (flag == false)
                System.out.print("Yes");
            else
                System.out.print("No");
        }

        System.out.println();
    }
}
