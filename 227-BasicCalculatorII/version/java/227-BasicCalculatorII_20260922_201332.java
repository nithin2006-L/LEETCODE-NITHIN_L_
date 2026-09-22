// Last updated: 9/22/2026, 8:13:32 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        Stack<Character> stk = new Stack<>();
4        StringBuilder ans = new StringBuilder();
5        for (char c : num.toCharArray()) {
6            while (k > 0 && !stk.isEmpty() && stk.peek() > c) {
7                stk.pop();
8                k--;
9            }
10            stk.push(c);
11        }
12        while (k > 0) {
13            stk.pop();
14            k--;
15        }
16        for (char c : stk) {
17            if (ans.length() == 0 && c == '0') continue;
18            ans.append(c);
19        }
20        return ans.length() == 0 ? "0" : ans.toString();
21    }
22}