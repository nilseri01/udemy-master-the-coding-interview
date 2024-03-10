// https://leetcode.com/problems/reverse-linked-list-ii
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode tempHead = new ListNode(0, head);
        ListNode oldPrev = tempHead;
        for (int i = 0; i < left - 1; i++) {
            oldPrev = oldPrev.next; // prev node of left
        }

        ListNode startPositionNode = oldPrev.next;
        for (int i = 0; i < right - left; i++) {
            ListNode oldNext = startPositionNode.next;
            startPositionNode.next = oldNext.next;
            oldNext.next = oldPrev.next;
            oldPrev.next = oldNext;
        }

        return tempHead.next;
    }
}
