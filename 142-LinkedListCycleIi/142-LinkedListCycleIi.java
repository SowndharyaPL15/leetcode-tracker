// Last updated: 9/9/2026, 2:14:44 PM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean has=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                has=true;
                break;
            }
        }
        if(has){
            fast=head;
            while(slow!=fast){
            slow=slow.next;
            fast=fast.next;}
        }
        else{return null;}
        return slow;
    }
}