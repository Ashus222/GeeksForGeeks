Given an arry A (may contain duplicates) of N elements and a positive integer K. The task is to count the number of elements which occurs exactly floor(N/K) times in the array.
 

Example 1:

Input:
5 2
1 4 1 2 4
Output:
2
Explanation:
In the given array, 1 and 
4 occurs floor(5/2) = 2 
times. So count is 2.
Example 2:

Input:
3 2
99 66 66 
Output:
1
Explanation:
In the given array, 99 occurs 
floor(3/2) = 1 time. So count 
is 1.
  
  class Geeks{
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        int ans=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if (a[i]==a[j]){
                    count++;
                }
            }
            if(count==f){
                ans++;
                a[i]=-1;
            }
        }
        System.out.println(ans);
    }
        
    }
