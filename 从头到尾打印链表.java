/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 //直接返回数组会导致后边的0也全部输出出来
class Solution {
    public int[] printListReversingly(ListNode head) {
        int[] res=new int [1010];
        ListNode pre=null;
        ListNode cnt=head;
        while(cnt!=null)
        {
            ListNode next=cnt.next;
            cnt.next=pre;
            pre=cnt;
            cnt=next;
        }
        int k=0;
        for(ListNode i=pre;i!=null;i=i.next)
        {
            res[k++]=i.val;
        }
        return res;
    }
}