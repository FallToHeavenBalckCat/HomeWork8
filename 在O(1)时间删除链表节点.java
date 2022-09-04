/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 //好n的O(1)做法
class Solution {
    public void deleteNode(ListNode node) {
        ListNode p=node.next;
        node.next=p.next;
        node.val=p.val;
    }
}