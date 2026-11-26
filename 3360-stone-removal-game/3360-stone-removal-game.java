class Solution {
    public boolean canAliceWin(int n) {
        int remove= 10;
        boolean alicet=true;
        while(n>=remove){
            n-=remove;
            remove--;
            alicet=!alicet;
        }

        return !alicet;
    }
}