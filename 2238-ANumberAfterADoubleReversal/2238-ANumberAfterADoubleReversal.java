// Last updated: 8/12/2026, 3:12:42 PM
class Solution {
    public boolean isSameAfterReversals(int n) {
        if (n == 0)
            return true;
        if (n % 10 == 0)
            return false;
        return true;
    }
}