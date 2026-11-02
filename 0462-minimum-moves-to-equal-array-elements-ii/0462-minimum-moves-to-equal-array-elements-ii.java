class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        // sort the array
        Arrays.sort(nums);

        // find avrmediamage of array
        int mediam=nums[n/2];

        int ans=0;
        // find mimimum move to all emement are equal
        for(int i=0; i<n; i++){
           ans+=Math.abs(nums[i]-mediam);
        }
        return ans;
    }
}