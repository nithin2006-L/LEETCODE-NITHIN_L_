// Last updated: 10/11/2026, 8:35:28 AM
1class Solution {
2    public boolean threeFibonacciSum(int n) {
3        int a =0,b=1;
4
5        while(true){
6            int c=a+b;
7            if(a+b+c==n){
8                return true;
9            }
10                if(a+b+c>n){
11                    return false;
12                }
13                a=b;
14                b=c;
15            }
16        }
17        
18    }
19