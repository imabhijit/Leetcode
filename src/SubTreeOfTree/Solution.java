package SubTreeOfTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(s);
        while(!queue.isEmpty()){
            TreeNode n = queue.poll();
            if(isSameTree(n,t)){
                return true;
            }
            if(n.left != null){
                queue.add(n.left);
            }
            if(n.right != null){
                queue.add(n.right);
            }
        }
        return false;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null){
            return p == q;
        }
        if(p.val == q.val){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}
