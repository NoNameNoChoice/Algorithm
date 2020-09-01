
/*
 * @ClassName: _669_TrimBST
 * @Description:
 * @Author: Se7en
 * @Date: 2020/9/1 6:47
 * @Version: 1.0
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class _669_TrimBST {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null)
            return null;

        if (root.val < L) {
            return trimBST(root.right, L, R);
        }

        if (root.val > R) {
            return trimBST(root.left, L, R);
        }

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);

        return root;
    }
}
