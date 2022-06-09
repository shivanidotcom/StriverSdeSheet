Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

 

Example 1:


Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
Example 2:

Input: root = [1]
Output: ["1"]
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
     List<String> al1;
    public void solve(TreeNode root,String str){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            al1.add(str+root.val);
        }
       
        solve(root.left,str+root.val+"->");
        solve(root.right,str+root.val+"->");
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        al1 = new ArrayList<>();
        solve(root,"");
        return al1;
    }
}
