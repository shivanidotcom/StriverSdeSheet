Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

 

Example 1:


Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
Example 2:

Input: head = [2,1], x = 2
Output: [1,2]
 

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
    public ListNode insert(ListNode head, int ele){
        ListNode newNode = new ListNode();
        newNode.val=ele;
        newNode.next = head;
        head = newNode;
        return head;
    }
    public ListNode arrayToLinkedList(ArrayList<Integer> al, int n){
        head = null;
        for(int i=n-1;i>=0;i--){
            head = insert(head,al.get(i));
        }
        return head;
    }
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> al = new ArrayList<>();
        for(ListNode curr= head ; curr!=null ; curr=curr.next){
            al.add(curr.val);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i:al){
            if(i<x){
                res.add(i);
            }
        }
        al.removeAll(res);
        res.addAll(al);
        System.out.println(res);
        head = arrayToLinkedList(res,res.size());
        return head;
    }
}
