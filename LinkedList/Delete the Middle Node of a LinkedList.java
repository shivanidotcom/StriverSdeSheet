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
    public ListNode deleteMiddle(ListNode head) {
        int count =0;
        for(ListNode curr=head;curr!=null;curr=curr.next){
            count++;
        }
        int mid=count/2;
        if(head == null) return null;
        if(head.next==null) return null;
        ListNode curr = head;
        ListNode prev = null;
        for(int i=0;i<mid;i++){
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        return head;
        
    }
}
