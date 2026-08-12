// Last updated: 8/12/2026, 3:15:30 PM
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,i,n=nums.length;
        for(i=0;i<n;i++)
        sum+=nums[i];
        int x=n*(n+1)/2;
        return x-sum;
         
    }
}