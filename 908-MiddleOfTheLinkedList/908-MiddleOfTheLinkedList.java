// Last updated: 9/1/2026, 11:45:26 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for singly-linked list.
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head; 
        ListNode fast = head; 
        while (fast != null && fast.next != null) {
            slow = slow.next;         
            fast = fast.next.next;    
        }
        return slow; 
    }
}

