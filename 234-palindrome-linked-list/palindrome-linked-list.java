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
    public boolean isPalindrome(ListNode head) {
        StringBuilder s=new StringBuilder();

        while(head!=null){
            s.append(Integer.toString(head.val));
            head=head.next;

        }

        String temp1=new String(s);

        String temp=new String(s.reverse());
        

        return temp1.equals(temp)?true:false;
        
    }
}