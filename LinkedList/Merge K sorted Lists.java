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
    public ListNode mergeKLists(ListNode[] lists) {
           ArrayList<Integer> al = new ArrayList<>();
          for(ListNode list : lists){
              while(list!=null){
                  al.add(list.val);
                  list=list.next;
              }
          }
        // sort array list
        Collections.sort(al);
        System.out.println(al);
        // creation of linked list
        ListNode newNode = new ListNode();
        ListNode head = newNode;
        for(int i:al){
            ListNode temp = new ListNode(i);
            newNode.next=temp;
            newNode = temp;
        }
        return head.next;
    }
}
