class Solution {
    // int max=0;
    //  public boolean isValid(String s) {
    //     int n = s.length();
    //     Stack<Character> st = new Stack<>();
    //     for (int i = 0; i < n; i++) {
    //         if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
    //             st.push(s.charAt(i));
    //         } else{
    //             if(st.isEmpty()){
    //                 return false;
    //             }
    //             else if (s.charAt(i) == ')' && st.peek() == '(' || s.charAt(i) == '}' && st.peek() == '{' ||
    //                 s.charAt(i) == ']' && st.peek() == '[') 
    //                 {

    //                  st.pop();
    //                 }
    //                 else{
    //                     return false;
    //                 }
    //         } 
    //     }
    //     return st.isEmpty();
    // }

    // private int solve(String s, String temp, int i){
    //     if(i==0){
    //         if(valid(temp)){
    //             max=temp.lenght();
    //             return 0;
    //         }
    //     }
        

    // }
    public int longestValidParentheses(String s) {
        int n=s.length();
        if(n<2) return 0;
        Stack<Integer> st=new Stack<>();
        int dp[]=new int[n];
        Arrays.fill(dp,0);
        int ans=0;

        for(int i=0; i<n; i++){
            if(s.charAt(i)=='('){
                st.add(i);
            }else{
                if(!st.isEmpty()){
                    int x=st.peek();
                    dp[i]=i-x+1;
                    if(x>=1) dp[i]+=dp[x-1];

                    st.pop();
                }
            }
            ans=Math.max(ans,dp[i]);
        }
        return ans;

        // if(n==0){
        //     return 0;
        // }
        // int open=0;
        // int close=0;
        // for(int i=0; i<n; i++){
        //     if(s.charAt(i)=='('){
        //         open++;
        //     }else if(s.charAt(i)==')'){
        //         close++;
        //     }
        // }
        // if(open==close){
        //     return open+close;
        // }else if(open<close){
        //     return 2*open;
        // }else if(open>close){
        //     return 2*close;
        // }else{
        //     return 0;
        // }
    }
}