package Y2022.february;

import domain.TreeNode;

/**
 * Title : Y2022.february <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-25 16:03
 */
public class Code12 {

    /**
     * 判断是否是镜像二叉树
     */

    public static boolean isMirrorTree(TreeNode node1, TreeNode node2) {

        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 != null && node2 != null && node1.val == node2.val) {
            return isMirrorTree(node1.left, node2.right) && isMirrorTree(node1.right, node2.left);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;

        TreeNode node10 = new TreeNode(1);
        TreeNode node20 = new TreeNode(2);
        TreeNode node30 = new TreeNode(3);
        node10.left = node20;
        node10.right = node30;

        System.out.println(isMirrorTree(node1, node10));

    }
}
