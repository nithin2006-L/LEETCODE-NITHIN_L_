// Last updated: 8/12/2026, 3:15:46 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
         if(n<1)
       return false;
        if(n==1) 
        return true;
        while(n%2==0){
            n=n/2;
        }
        if(n==1)
            return true;
            else
            return false;
     // return n>0 && (n&(n-1))==0;
        
    }
}