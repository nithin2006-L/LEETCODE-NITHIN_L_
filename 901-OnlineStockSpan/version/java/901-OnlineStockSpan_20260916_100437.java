// Last updated: 9/16/2026, 10:04:37 AM
1class Solution {
2    public boolean validateStackSequences(int[] pushed, int[] popped) {
3            
4        Deque<Integer> stack = new ArrayDeque<>();
5        int index = 0;
6        for(int p : pushed){
7            stack.push(p);
8            while (!stack.isEmpty() && stack.peek() == popped[index]){
9                stack.pop();
10                index++;
11            }
12        }
13        return stack.isEmpty();
14    }
15        
16    }
17