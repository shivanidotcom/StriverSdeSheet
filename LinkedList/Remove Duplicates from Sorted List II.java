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
    public ListNode insert(ListNode head, int arrayElement){
        ListNode newNode = new ListNode(); 
        newNode.val = arrayElement; 
        newNode.next = head; 
        head = newNode; 
        return head; 
    }
    public ListNode arrayToLinkedList(ArrayList<Integer> freq, int n) 
    { 
        head = null; 
        for (int i = n - 1; i >= 0 ; i--) 
            head = insert(head, freq.get(i)); 
        return head; 
    } 
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        for(ListNode curr = head; curr!=null; curr=curr.next){
            al.add(curr.val);
        }
        ArrayList<Integer> freq = new ArrayList<>();
        for(int i=0;i<al.size();i++){
            int value = Collections.frequency(al,al.get(i));
            if(value==1){
                freq.add(al.get(i));
            }
        }
        System.out.println(freq);
        head = arrayToLinkedList(freq, freq.size()); 
        return head;
    }
}
