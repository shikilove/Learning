package Y2022.february;

import domain.TreeNode;

/**
 * Title : Y2022.february <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-16 14:51
 */
public class Code3 {
    /**
     * 翻转二叉树
     */

    public TreeNode invertTree(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        node1.print(node1);
        new Code3().invertTree(node1);
        node1.print(node1);
    }
}
