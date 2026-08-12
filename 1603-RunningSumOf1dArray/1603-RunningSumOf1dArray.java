// Last updated: 8/12/2026, 3:13:04 PM
class Solution {
    public int[] runningSum(int[] n) {
        for(int i=1;i<n.length;i++){
        n[i]=n[i-1]+n[i];
        }
        return n;
    }
}

//i=1 la: n[1] = n[0] + n[1] → 1 + 2 = 3, ---> [1,3,3,4]
//i=2 la: n[2] = n[1] + n[2] → 3 + 3 = 6, ---> [1,3,6,4]
//i=3 la: n[3] = n[2] + n[3] → 6 + 4 = 10, ---> [1,3,6,10]
