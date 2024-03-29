package RangeSumBST;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null){
            return 0;
        } else if (root.val > R){
            return rangeSumBST(root.left, L, R);
        } else if (root.val < L){
            return rangeSumBST(root.right, L, R);
        }
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}
