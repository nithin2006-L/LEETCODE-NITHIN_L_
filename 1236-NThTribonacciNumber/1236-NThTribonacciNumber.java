// Last updated: 8/12/2026, 3:13:28 PM
class Solution {
    public int tribonacci(int n) {
         if(n==0||n==1) 
     return n;
     if(n==2)
     return 1;
     int n1=0;
     int n2=1;
     int n3=1;
     for(int i=3;i<=n;i++){
       int n4=n1+n2+n3;
        n1=n2;
        n2=n3;
        n3=n4;
     } return n3;
        
    }
}