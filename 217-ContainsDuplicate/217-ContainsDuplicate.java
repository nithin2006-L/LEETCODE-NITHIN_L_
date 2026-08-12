// Last updated: 8/12/2026, 3:15:49 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int ele : nums) {
            if (!s.add(ele))
                return true;
        }
        return false;
    }
}