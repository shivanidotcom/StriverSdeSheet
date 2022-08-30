/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/
import java.util.*;
class Pair {
    BinaryTreeNode node;
    int hd;
    Pair(BinaryTreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
public class Solution {
      
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		// Write your code here.
         
        ArrayList<Integer> res = new ArrayList<>(); 
        if(root == null) {
            return res;
        }
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0)); 
        while(!q.isEmpty()) {
            Pair it = q.remove();
            int hd = it.hd; 
            BinaryTreeNode curr = it.node; 
            if(map.get(hd) == null) map.put(hd, curr.val); 
            if(curr.left != null) {
                q.add(new Pair(curr.left, hd - 1)); 
            }
            if(curr.right != null) {
                q.add(new Pair(curr.right, hd + 1)); 
            }
        }
    
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            res.add(entry.getValue()); 
        }
        return res; 
    
	}
}
//time complexity = o(n)
// space complexity = o(n)
