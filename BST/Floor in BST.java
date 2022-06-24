/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution {

    public static int floorInBST(TreeNode<Integer> root, int X) {
        //    Write your code here.
        TreeNode<Integer> res = null;
        while(root!=null){
            if(root.data==X){
                return root.data;
            }else if(root.data<X){
                res= root;
                root=root.right;
            }else{
                root=root.left;
            }
        }
        return res.data;
    }
}
