public static void utility(int d, int n){
    
    int x = n % 7;
    int ans = d - x;
    if(ans >= 0){
        System.out.print( ans);
    }else{
        System.out.print(ans + 7);
    }
    
}
