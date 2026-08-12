// Last updated: 8/12/2026, 3:17:04 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for( int num:nums){
            result ^=num;
        }
       return result;
}}