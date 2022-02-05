Given a matrix(2D array) M of size N*N consisting of 0s and 1s only. The task is to find the column with maximum number of 0s.

Example 1:

Input:
3
1 1 0
1 1 0
1 1 0

Output:
2

Explanation:
2nd column (0-based indexing) is having 3 zeros which

class Geeks{
    
    static int columnWithMaxZero(int a[][],int n){
        
        int r = a.length;
        int c = a[0].length;
        
        int resCol = -1;
        int maxZero = 0;
        
        for(int j = 0; j < n; j++) {
            
            int countZero = 0;
            
            for(int i = 0; i < n; i++) {
                if(a[i][j] == 0) {
                    countZero++;
                }
            }
            
            if(countZero > maxZero) {
                maxZero = countZero;
                resCol = j;
            }
        }
        
        return resCol;
    }
}
