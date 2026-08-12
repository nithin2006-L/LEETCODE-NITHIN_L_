// Last updated: 8/12/2026, 3:17:09 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for (int currentPrice : prices) {
            min = Math.min(currentPrice, min);
            max = Math.max(max, currentPrice - min);
        }
        
        return max;
    }
}