// Last updated: 8/12/2026, 3:15:18 PM
class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}