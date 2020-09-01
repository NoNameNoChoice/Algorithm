
/*
 * @ClassName: _145_BTPostorderTraversal
 * @Description:
 * @Author: Se7en
 * @Date: 2020/9/1 10:08
 * @Version: 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class _145_BTPostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        postorderTraversal(root, list);
        return list;
    }

    public void postorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null)
            return;

        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list);
        list.add(root.val);
    }
}
