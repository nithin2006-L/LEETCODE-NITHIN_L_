// Last updated: 8/12/2026, 3:15:36 PM
class Solution {
    public int addDigits(int n) {
        int d,sum;
        while(n>9){
            sum=0;
        	while(n!=0){
		    d=n%10;
		    sum=sum+d;
		    n=n/10;
    }
    n=sum;
    } return n;
    }
}