// Last updated: 8/12/2026, 3:11:20 PM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int startColor=(start[0]+start[1])%2;
        int targetColor=(target[0]+target[1])%2;

        return startColor==targetColor;
    }
}