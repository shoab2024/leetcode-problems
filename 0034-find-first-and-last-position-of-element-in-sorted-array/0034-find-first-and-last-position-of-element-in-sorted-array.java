class Solution {
    public int[] searchRange(int[] nums, int target) {
       int ans[]={-1,-1};

       ans[0]= firstindex(nums, target);

       ans[1]= lastindex(nums, target);

       return ans;
    }

    private int firstindex(int[] nums, int target){
        int n=nums.length;
        int ans=-1;
        int st=0,   end=n-1;

        while(st<=end){
            int mid=st+(end-st)/2;

            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }else if(nums[mid]<target){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    private int lastindex(int[] nums, int target){
        int n=nums.length;
        int ans=-1;

        int st=0,  end=n-1;

        while(st<=end){
            int mid=st+(end-st)/2;

            if(nums[mid]==target){
                ans=mid;
                st=mid+1;
            }else if(nums[mid]<target){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}