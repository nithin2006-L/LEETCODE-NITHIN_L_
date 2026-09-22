// Last updated: 9/22/2026, 8:09:38 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    Map<Integer, Integer> map = new HashMap<>();
19    int idx = 0;
20    public TreeNode buildTree(int[] preorder, int[] inorder) {
21        int n = inorder.length;
22        for (int i = 0; i < n; i++)
23            map.put(inorder[i], i);
24        TreeNode ans = dfs(preorder, 0, n- 1);
25        return ans;
26    }
27    public TreeNode dfs(int[] preorder, int l, int r) {
28        if (l > r) 
29            return null;
30        int val = preorder[idx];
31        idx += 1;
32        TreeNode node = new TreeNode(val);
33        int m = map.get(val);
34        node.left = dfs(preorder, l, m - 1);
35        node.right = dfs(preorder, m + 1, r);
36        return node;
37    }
38}