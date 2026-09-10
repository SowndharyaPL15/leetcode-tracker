// Last updated: 9/10/2026, 11:33:32 AM
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
17    private int answer = 0;
18
19    private int[] dfs(TreeNode node) {
20        if (node == null) {
21            return new int[]{0, 0};
22        }
23
24        int[] left = dfs(node.left);
25        int[] right = dfs(node.right);
26
27        int sum = left[0] + right[0] + node.val;
28        int count = left[1] + right[1] + 1;
29
30        if (node.val == sum / count) {
31            answer++;
32        }
33
34        return new int[]{sum, count};
35    }
36
37    public int averageOfSubtree(TreeNode root) {
38        dfs(root);
39        return answer;
40    }
41}