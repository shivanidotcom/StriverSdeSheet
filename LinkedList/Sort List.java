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
    ListNode head;
    public ListNode insert(ListNode head , int ele){
        ListNode newNode = new ListNode(); 
        newNode.val = ele; 
        newNode.next = head; 
        head = newNode; 
        return head;
    }
    public ListNode arrayToLinkedList(ArrayList<Integer> al , int n){
         head = null; 
        for (int i = n - 1; i >= 0 ; i--) 
            head = insert(head, al.get(i)); 
        return head; 
    }
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        for(ListNode curr=head;curr!=null;curr=curr.next){
            al.add(curr.val);
        }
        Collections.sort(al);
        System.out.println(al);
        head = arrayToLinkedList(al,al.size());
        return head;
    }
}
