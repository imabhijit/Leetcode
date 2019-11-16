package BST2GST;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode bstToGst(TreeNode root) {
        dft(root, 0);
        return root;
    }

    private int dft(TreeNode root, int parentValue) {
        if (root == null) { return parentValue; } // base case.
        root.val += dft(root.right, parentValue); // recurse to right subtree.
        return dft(root.left, root.val); // recurse to left subtree.
    }
}
