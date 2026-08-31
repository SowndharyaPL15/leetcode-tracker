// Last updated: 8/31/2026, 2:19:30 PM
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
11public class Solution {
12    public ListNode swapPairs(ListNode head) {
13        if ((head == null)||(head.next == null))
14            return head;
15        ListNode n = head.next;
16        head.next = swapPairs(head.next.next);
17        n.next = head;
18        return n;
19    }
20}