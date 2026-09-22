// Last updated: 9/22/2026, 8:14:54 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        Stack<Integer> s = new Stack<>();
4
5        int nextgreater[] = new int[nums.length];
6
7        for(int i=2 * nums.length - 1; i>=0; i--){
8            int index = i % nums.length;
9
10            while(!s.isEmpty() && s.peek() <= nums[index] ){
11                s.pop();
12            }
13            if(s.isEmpty()){
14                nextgreater[index] = -1;
15            }
16            else{
17                nextgreater[index] = s.peek();
18            }
19            s.push(nums[index]);
20        }
21    return nextgreater;
22    }
23}