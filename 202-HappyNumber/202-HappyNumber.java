// Last updated: 8/12/2026, 3:16:15 PM
class Solution {
    public boolean isHappy(int n) {
        int d,sum;
        while(n!=1 && n!=4){
            sum=0;
            while(n!=0){
             d=n%10;
             sum=sum+(d*d);
             n=n/10;
            } n=sum;
        } if(n==1)
        return true;
        else 
        return false;
    }
}