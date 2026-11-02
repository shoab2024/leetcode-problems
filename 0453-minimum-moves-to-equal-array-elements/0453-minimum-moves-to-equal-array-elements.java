class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int ans=0;
        int min=Integer.MAX_VALUE;
        // fimd min value
        for( int i=0; i<n; i++){
            min=Math.min(min,nums[i]);
        }

        // find the minimum moves 
        for(int i=0; i<n; i++){
            ans+=nums[i]-min;
        }
        return ans;
    }
}