class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int bestbuy=prices[0];
        int max=0;
        for(int i=1; i<n; i++){
            if(prices[i]-bestbuy>max){
                max=prices[i]-bestbuy;
            }
            if(prices[i]<bestbuy){
                bestbuy=prices[i];
            }
        }
        return max;
    }
}