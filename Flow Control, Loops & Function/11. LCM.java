Given two numbers a and b. The task is to find out their LCM.

 

Example 1:

Input:
a = 5, b = 10
Output:
10
Explanation:
LCM of 5 and 10 is 10
Example 2:

Input:
a = 14, b = 8
Output:
56
Explanation:
LCM of 14 and 8 is 56

public static int LCM(int a, int b){

   
    int x = Math.max(a,b);
    int ans = x;
    for(int  i =x;i<=a*b ;i++){
        if(i % a == 0 && i % b == 0){
            ans  = i;
            break;
        }
    }
    return ans;
    //System.out.print(ans);

    
}
