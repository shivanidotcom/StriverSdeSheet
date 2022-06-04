Symmetric tree- mirror images

=================

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return helperMethod(root.left,root.right);
    }
    public boolean helperMethod(TreeNode n1 , TreeNode n2){
        if(n1==null && n2==null) return true;
        if(n1==null || n2==null) return false;
        if(n1.val!=n2.val) return false;
        return helperMethod(n1.left,n2.right) && helperMethod(n1.right,n2.left);
    }
}
