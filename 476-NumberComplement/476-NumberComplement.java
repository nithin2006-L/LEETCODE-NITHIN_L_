// Last updated: 8/12/2026, 3:14:22 PM
class Solution {
    public int findComplement(int num) {
        // int r=1;
        // while(r<num){
        //     r=(r<<1)|1;
        // }
        // return r^num;
        int mask =0;
        int temp=num;
        while(temp>0){
            mask=(mask<<1)|1;
            temp>>=1;
        } return num^mask;
    }
}