
/*
 * @ClassName: PublicStruct
 * @Description:
 * @Author: Se7en
 * @Date: 2020/9/1 10:12
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
