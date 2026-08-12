// Last updated: 8/12/2026, 3:11:18 PM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int k= Math.min(prices.length,discounts.length);
         double total=0.0;
        for(int i=0;i<k;i++){
            int price=prices[prices.length-1-i];
            int discount=discounts[discounts.length-1-i];
            total+=price*(100.0-discount)/100.0;
        }
        for(int i=0;i<prices.length-k;i++){
            total+=prices[i];
        }
        return total;
        
    }
}