// Last updated: 8/12/2026, 3:16:32 PM
class Solution {
    public int reverseBits(int n) {
        int ans=0,i;
        for(i=0;i<32;i++){
            ans<<=1;
            ans|=(n& 1);
            n>>=1;
        }
        return ans;
    }
}