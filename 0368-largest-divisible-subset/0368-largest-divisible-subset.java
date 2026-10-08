class Solution {
    
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int pr[]=new int[n];
        Arrays.fill(pr,-1);

        int Maxi=0;
        int lastidx=0;

        for(int i=0; i<n; i++){
            for(int pre=0; pre<i; pre++){
                if(nums[i]>nums[pre] && dp[pre]+1>dp[i] && nums[i]%nums[pre]==0 || nums[pre]%nums[i]==0){
                    dp[i]=dp[pre]+1;
                    pr[i]=pre;
                }
                if(dp[i]>Maxi){
                    Maxi=dp[i];
                    lastidx=i;
                }
            }
        }

        ArrayList<Integer> al=new ArrayList<>();

        while(lastidx!=-1){
            al.add(nums[lastidx]);
            lastidx=pr[lastidx];
        }

       
        Collections.reverse(al);
        return al;
    }
}