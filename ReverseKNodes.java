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
    public int len(ListNode head){
        int c=0;
        while(head!=null)
        {
            c++;
            head=head.next;
        }
        return c;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        int n=len(head);
        ListNode pre=dummy,cur,nxt;
        while(n>=k){
            cur=pre.next;
            nxt=cur.next;
            for(int i=1;i<k;i++){
                cur.next=nxt.next;
                nxt.next=pre.next;
                pre.next=nxt;
                nxt=cur.next;
            }
            pre=cur;
            n-=k;
        }
        return dummy.next;
    }
}
