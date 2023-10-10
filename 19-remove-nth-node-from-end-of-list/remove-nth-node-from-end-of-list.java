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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count=0;
        ListNode temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        count=count-n;
        temp=head;

        int i=1;
        while(i<count){
            temp=temp.next;
            i++;
        }
        if(count==0)
        return temp.next;
        if(temp.next==null)
         return null;
         else if(temp.next.next==null)
          temp.next=null;
         else
           temp.next=temp.next.next;

        return head;
        
        
    }
}