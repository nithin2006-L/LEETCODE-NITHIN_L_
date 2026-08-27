// Last updated: 8/27/2026, 9:05:58 AM
1class Solution {
2    public String countAndSay(int n) {
3        if(n==1)
4        return "1";
5
6        String s=countAndSay(n-1);
7
8        int c=0;
9        StringBuilder ans=new StringBuilder();
10
11        for(int i=0;i<s.length();i++){
12            c++;
13            if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1)){
14                ans.append(c).append(s.charAt(i));
15                c=0;
16            }
17        }
18        return ans.toString();
19        
20    }
21}