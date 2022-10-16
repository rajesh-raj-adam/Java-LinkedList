/**
 * Definition for singly-linked list.
 * public class ListListNode {
 *     int val;
 *     ListListNode next;
 *     ListListNode() {}
 *     ListListNode(int val) { this.val = val; }
 *     ListListNode(int val, ListListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode reverse(ListNode ptr) {
    ListNode pre=null;
    ListNode nex=null;
    while(ptr!=null) {
        nex = ptr.next;
        ptr.next = pre;
        pre=ptr;
        ptr=nex;
    }
    return pre;
}

static boolean isPalindrome(ListNode head) {
    if(head==null||head.next==null) return true;
        
    ListNode slow = head;
    ListNode fast = head;
        
    while(fast.next!=null&&fast.next.next!=null) {
        slow = slow.next;
        fast = fast.next.next;
    }
        
    slow.next = reverse(slow.next);
    slow = slow.next;
        
    while(slow!=null) {
        if(head.val != slow.val) return false;
        head = head.next;
        slow = slow.next;
    }
    return true;
}
}
