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
//has 3 cases
// case 1 : if leaf node
// case 2 : if root has single child
// case 3 : if root has two child
class Solution {
    public TreeNode getSucc(TreeNode root){
        TreeNode curr = root.right;
        while(curr!=null && curr.left!=null){
            curr = curr.left;
        }
        return curr;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
       if(root==null){
           return null;
       }   
        if(root.val<key){
            root.right = deleteNode(root.right, key);
        }else if( root.val > key){
            root.left = deleteNode(root.left, key);
        }else{
            // 3 cases are handled here
            if(root.left == null) return root.right;
            else if( root.right == null ) return root.left;
            else{
                TreeNode succ = getSucc(root);
                root.val = succ.val;
                root.right = deleteNode(root.right, succ.val);
            }
           
        }
        return root;
    }
}
