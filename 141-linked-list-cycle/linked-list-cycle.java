/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> map=new HashMap<>();

        while(head!=null){
            if(map.containsKey(head))
            return true;
            else{
                map.merge(head,1,(a,b)->a+b);
            }

            head=head.next;
        }

        return false;
        
    }
}