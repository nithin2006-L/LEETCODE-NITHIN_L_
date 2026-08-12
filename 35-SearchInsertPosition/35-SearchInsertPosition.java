// Last updated: 8/12/2026, 3:18:11 PM
class Solution {
    public int searchInsert(int[] nums, int target){
    int low=0;
    int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low + high)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]<target)
            low=mid+1;
            else
            high=mid-1;
        }
        return low;
        
        
    }
}