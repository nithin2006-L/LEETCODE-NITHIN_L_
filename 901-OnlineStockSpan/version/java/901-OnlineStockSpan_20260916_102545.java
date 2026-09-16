// Last updated: 9/16/2026, 10:25:45 AM
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Stack<Integer> stack = new Stack<>();
4        for (int i = 0; i < asteroids.length; i++) {                        
5            while (!stack.isEmpty()
6                    && stack.peek() > 0
7                    && asteroids[i] < 0) {
8                int top = stack.peek();                                
9                int collide = top + asteroids[i];                
10                if (collide < 0) {                    
11                    stack.pop();                
12                }            
13                else if (collide > 0) {                
14                    asteroids[i] = 0;
15                    break;
16                }                
17                else {                    
18                    asteroids[i] = 0;                    
19                    stack.pop();
20                    break;
21                }
22            }            
23            if (asteroids[i] != 0) {
24                stack.push(asteroids[i]);
25            }
26        }
27        int[] ans = new int[stack.size()];
28        for (int i = stack.size() - 1; i >= 0; i--) {
29            ans[i] = stack.pop();
30        }
31        return ans;
32    }
33}