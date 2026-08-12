// Last updated: 8/12/2026, 3:13:01 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles+(numBottles-1)/(numExchange-1); 
    }
}