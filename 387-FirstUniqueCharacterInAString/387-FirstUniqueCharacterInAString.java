// Last updated: 8/12/2026, 3:14:50 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int n = s.length();
          for (int i = 0; i < n; i++) {            
            int index = s.charAt(i) - 'a';
            count[index]++;
        }
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if (count[index] == 1) {
                return i;
            }       
        }
        return -1;
    }
}