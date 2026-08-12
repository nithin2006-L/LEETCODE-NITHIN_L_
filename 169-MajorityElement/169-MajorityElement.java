// Last updated: 8/12/2026, 3:16:50 PM
class Solution {
    public int majorityElement(int[] nums) {
        
        int i,t=0,c=0;
        for(i=0;i<nums.length;i++)
        {
            if(c==0)
            t=nums[i];
            if(t==nums[i])
            c++;
            else
            c--;
        }
        return t;

    }
}