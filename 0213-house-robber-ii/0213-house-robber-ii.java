class Solution {
    private int solve(int nums[], int n, int dp[]){
        if(n==0) return 0;
        if(n==1) return nums[0];

        if(dp[n]!=-1) return dp[n];
        int op1=nums[n-1]+ (solve(nums,n-2,dp));
        int op2=solve(nums, n-1,dp);

        return dp[n]=Math.max(op1,op2);

    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int house1[]=new int[nums.length-1];
        int house2[]=new int[nums.length-1];

        int dp1[]=new int[nums.length+1];
        int dp2[]=new int[nums.length+1];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        for(int i=0; i<nums.length; i++){
            if(i!=0){
                house2[i-1]=nums[i];
            }
            if(i != nums.length-1){
                house1[i]=nums[i];
            }
        }
        return Math.max(solve(house1,house1.length,dp1),solve(house2,house2.length,dp2));
    }
}