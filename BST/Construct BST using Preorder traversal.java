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
    public TreeNode construct(TreeNode root, int ele){
        if(root==null) return new TreeNode(ele);
        if(root.val > ele)
             root.left=construct(root.left,ele);
        else if(root.val < ele)
            root.right=construct(root.right,ele);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
       
        for(int i:preorder){
            root = construct(root,i);
        }
        return root;
    }
    
}
