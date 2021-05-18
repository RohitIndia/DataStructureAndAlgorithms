package com.ds.DynamicProgramming;

public class KnapSackMaximumProfit {
    public static int[][] t = new int[100][100]; // Based on the constraints initialize the array , make it global and dont pass as argument
    public static void main(String[] args) {
        // recursive + Memoization
        // Top Down using table(Memoization)
    }

    public static int getMaximumProfitWithRecusrive(int[] val, int[] wt, int w, int n){
        if (n==0 || w==0){
            return 0;
        }
        if(wt[n-1]<=w){
            // Here we considering the choices , whether we need to consider that option or not.
            return Math.max(val[n-1]+ getMaximumProfitWithRecusrive(val, wt, w-wt[n-1], n-1), getMaximumProfitWithRecusrive(val, wt, w,n-1));
        }else{
            return getMaximumProfitWithRecusrive(val,wt,w,n-1);
        }
    }

    // Here it becomes the DP , we used the already calculated task by storing them in table(t) if
    public static int getMaximumProfitWithRecusrivePlusMemoization(int[] val, int[] wt, int w, int n){
        if (n==0 || w==0){
            return 0;
        }
        if(t[n][w]!=0){
            return t[n][w];
        }
        if(wt[n-1]<=w){
            // Here we considering the choices , whether we need to consider that option or not.
            t[n][w] =  Math.max(val[n-1]+ getMaximumProfitWithRecusrivePlusMemoization(val, wt, w-wt[n-1], n-1), getMaximumProfitWithRecusrivePlusMemoization(val, wt, w,n-1));
        }else{
            t[n][w] =  getMaximumProfitWithRecusrivePlusMemoization(val,wt,w,n-1);
        }
        return t[n][w];
    }

    public static int getMaximumProfitWithTopDownApproach(int[] val, int[] wt, int w, int n){
     // 1 step is to create the array.
        int[][] arr = new int[n+1][w+1];
        for(int i = 1; i<n+1;i++){
            for(int j=1; j<w+1;j++){
                if(wt[i-1]<=j){
                    t[i][j] = Math.max(val[i-1]+ t[i-1][j-wt[i-1]], t[i-1][j]);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][w];
    }
}
