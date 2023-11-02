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
    private ListNode reverse(ListNode head,int k,int c){
         if(head==null || c==0)
          return head;

        int count=0;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;

        while(curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }

        //previous will be my head;
        if(next!=null)
         head.next=reverse(curr,k,--c);

        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
       int count=0;
       ListNode temp=head;
       while(temp!=null){
           count++;
           temp=temp.next;
       }
       return reverse(head,k,count/k);
    }
}