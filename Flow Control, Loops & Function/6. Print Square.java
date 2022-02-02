Given an integer S, write a program to print the square of size S using * character. 

Before submitting code, verify it by running offline. Does your square visually looks like a square?

Example 1:

Input:
S = 4
Output:


Explanation:
It's a square! Each side contains S = 4 *.


public static void square(int s){
  
  int count=s;
    for(int i=0;i<s;i++){
        if(i==0){
            count=s;
            while(count-->0)System.out.print("* ");
        }
        else if(i==s-1){
            count=s;
            while(count-->0)System.out.print("* ");
        }
        else{
            count=2*s-3;
            System.out.print("*");
            while(count-->0)System.out.print(" ");
            System.out.print("*");
        }
        System.out.println();
    }
}
