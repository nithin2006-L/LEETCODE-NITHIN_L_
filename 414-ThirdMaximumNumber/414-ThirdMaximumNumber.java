// Last updated: 8/12/2026, 3:14:37 PM
class Solution {
    public int thirdMax(int[] nums) {
       
        Long firstMax = null;
        Long secondMax = null;
        Long thirdMax = null;
        
        for (int num : nums) {
            long current = (long) num;
            
            if ((firstMax != null && current == firstMax) || 
                (secondMax != null && current == secondMax) || 
                (thirdMax != null && current == thirdMax)) {
                continue;
            }
            
      
            if (firstMax == null || current > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = current;
            } else if (secondMax == null || current > secondMax) {
                thirdMax = secondMax;
                secondMax = current;
            } else if (thirdMax == null || current > thirdMax) {
                thirdMax = current;
            }
        }
        
   
        return thirdMax == null ? firstMax.intValue() : thirdMax.intValue();
    }
}