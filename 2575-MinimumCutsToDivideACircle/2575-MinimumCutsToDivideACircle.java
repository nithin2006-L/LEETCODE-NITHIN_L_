// Last updated: 8/12/2026, 3:12:29 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n%2==0){
            return n/2;
        }
        return n;
    }
}