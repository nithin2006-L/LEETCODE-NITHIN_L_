// Last updated: 8/12/2026, 3:15:03 PM
class Solution {
    public boolean isPowerOfThree(int n) {
         if(n<1)
       return false;
        if(n==1) 
        return true;
        while(n%3==0){
            n=n/3;
        }
        if(n==1)
            return true;
            else
            return false;
        // return n>0 && (n&(n-1))!=0;
    }
}