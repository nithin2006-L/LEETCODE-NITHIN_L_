// Last updated: 8/12/2026, 3:13:26 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;

        // Find the size of the decompressed array
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] ans = new int[size];
        int index = 0;

        // Fill the array
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            while (freq > 0) {
                ans[index++] = val;
                freq--;
            }
        }

        return ans;
    }
}