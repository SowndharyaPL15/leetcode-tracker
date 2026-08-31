// Last updated: 8/31/2026, 11:13:17 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        List<Integer> nums = new ArrayList<>();
14        while(head != null){
15            nums.add(head.val);
16            head = head.next;
17        }
18        List<Integer> criticalPoints = new ArrayList<>();
19        int n = nums.size();
20        for(int i = 1; i < n - 1; i++){
21            if(nums.get(i) > nums.get(i - 1) && nums.get(i) > nums.get(i + 1)){
22                criticalPoints.add(i);
23            }
24            else if(nums.get(i) < nums.get(i - 1) && nums.get(i) < nums.get(i + 1)){
25                criticalPoints.add(i);
26            }
27        }
28        int m = criticalPoints.size();
29        if(m < 2){
30            return new int[]{-1, -1};
31        }
32        int minDist = Integer.MAX_VALUE;
33        int maxDist = criticalPoints.get(m - 1) - criticalPoints.get(0);
34        for(int i = 1; i < m; i++){
35            minDist = Math.min(
36                minDist,
37                criticalPoints.get(i) - criticalPoints.get(i - 1)
38            );
39        }
40        return new int[]{minDist, maxDist};
41    }
42}