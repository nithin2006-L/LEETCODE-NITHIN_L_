// Last updated: 9/22/2026, 8:11:39 PM
1class Solution {
2    public int calculate(String s) {
3        int num = 0;
4        char operator = '+';
5        int last = 0, sum = 0;
6
7        for (int i = 0; i < s.length(); i++) {
8            char c = s.charAt(i);
9
10            if (Character.isDigit(c)) {
11                num = num * 10 + (c - '0');
12            }
13
14            if (isOperator(c) || i == s.length() - 1) {
15                if (operator == '+') {
16                    sum += last;
17                    last = num;
18                }
19                else if (operator == '-') {
20                    sum += last;
21                    last = -num;
22                }
23                else if (operator == '*') last *= num;
24                else if (operator == '/') last /= num;
25
26                num = 0;
27                operator = c;
28            }
29        }
30
31        return sum += last;
32    }
33
34    private boolean isOperator(char c) {
35        return c == '+' || c == '-' || c == '*' || c == '/';
36    }
37}
38
39// TC: O(n), SC: O(1)