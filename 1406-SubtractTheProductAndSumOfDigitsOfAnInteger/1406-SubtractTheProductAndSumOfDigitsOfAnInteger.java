// Last updated: 8/12/2026, 3:13:15 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int d,sum,pro=1;
            sum=0;
        	while(n!=0){
		    d=n%10;
		    sum=sum+d;
            pro=pro*d;
		    n=n/10;
    }
     return pro-sum;
    }
}
