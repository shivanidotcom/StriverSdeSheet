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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        for(ListNode curr = head ; curr!=null ; curr= curr.next){
            al.add(curr.val);
        }
        System.out.println(al);
        if(head == null){
            return null;
        }
        return construct(al,0,al.size()-1);
    }
    public TreeNode construct(ArrayList<Integer> al , int left, int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode curr = new TreeNode(al.get(mid));
        curr.left = construct(al,left,mid-1);
        curr.right = construct(al,mid+1,right);
        return curr;
    }
}
