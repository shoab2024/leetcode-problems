class Solution {

    int max(int x, int y){
        if(x>=y){
            return x;
        }else{
            return y;
        }
    }
    
    public int rob(int[] nums) {
        int n=nums.length;
        // base case
        if(n==1) return nums[0];

        int dp[]=new int[n];

        dp[0]=nums[0];
        dp[1]=max(nums[1],dp[0]);

        for(int i=2; i<n; i++){
            dp[i]=max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}