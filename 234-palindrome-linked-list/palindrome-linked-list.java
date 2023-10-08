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
    private static ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode prev=null;
        while(current!=null){
            ListNode temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;;
        }

        return prev;
    }
    public boolean isPalindrome(ListNode head) {

        ListNode fast=head;
        ListNode slow=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        slow.next=reverse(slow.next);
        ListNode dummy=head;

        slow=slow.next;
        while(slow!=null){
            if(dummy.val==slow.val){
             slow=slow.next;
             dummy=dummy.next;
            }
            else return false;
        }

        return true;

        
    }
}