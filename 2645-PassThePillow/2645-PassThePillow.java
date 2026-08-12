// Last updated: 8/12/2026, 3:12:25 PM
class Solution {
    public int passThePillow(int n, int t) {
        int c=t/(n-1);
        int rs=t%(n-1);
        return c % 2==0? rs+1 :n-rs;
    }
}