// https://leetcode.com/problems/reverse-linked-list
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
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode newNext = null;
        while (head != null) {
            ListNode oldNext = head.next;
            head.next = newNext;
            newNext = head;
            head = oldNext;
        }
        return newNext;
    }
}
