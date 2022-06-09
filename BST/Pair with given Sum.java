Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST such that their sum is equal to the given target.

 

Example 1:


Input: root = [5,3,6,2,4,null,7], k = 9
Output: true
Example 2:


Input: root = [5,3,6,2,4,null,7], k = 28
Output: false
 
  
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
   //approach using inorder traversal 
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorder(TreeNode root, List<Integer> list){
        if(root==null) return list;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
        return list;
    }
    public boolean findTarget(TreeNode root, int k) {
        inorder(root,list);
        int left = 0;
        int right = list.size()-1;
        while(left<right){
            if(list.get(left)+list.get(right)==k){
                return true;
            }else if(list.get(left)+list.get(right)>k){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }
}
