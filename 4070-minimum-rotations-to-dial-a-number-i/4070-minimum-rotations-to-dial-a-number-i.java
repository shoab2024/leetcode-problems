class Solution {
    public int minRotations(String s) {
        int n=s.length();
        int tr=0;
        int curr=0;
        for(int i=0; i<n; i++){
            int target=s.charAt(i)-'0';
            int diff=Math.abs(curr-target);
            tr+=Math.min(diff,10-diff);
            curr=target;
        }
        return tr;
    }
}