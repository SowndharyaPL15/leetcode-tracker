// Last updated: 9/2/2026, 4:19:50 PM
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
17    TreeNode first;
18    TreeNode second;
19    TreeNode prev;
20    public void recoverTree(TreeNode root) {
21        helper(root);
22        int temp = first.val;
23        first.val = second.val;
24        second.val = temp;
25    }
26    void helper(TreeNode node) {
27        if (node == null) return;
28        helper(node.left);
29        if (prev != null && prev.val > node.val) {
30            if (first == null) {
31                first = prev;
32            }
33            second = node;
34        }
35        prev = node;
36        helper(node.right);
37    }
38}