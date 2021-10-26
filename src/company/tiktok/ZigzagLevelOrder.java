package company.tiktok;

import domain.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Title : company.tiktok <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description : Z字型遍历二叉树
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-26 14:03
 */
public class ZigzagLevelOrder {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        int depth = 0;
        LinkedList<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            TreeNode node = null;
            for (int i = 0; i < size; i++) {
                if (depth % 2 == 0) {
                    node = deque.pollLast();
                    if (node.right != null) {
                        deque.offerFirst(node.right);
                    }
                    if (node.left != null) {
                        deque.offerFirst(node.left);
                    }

                } else {
                    node = deque.pollFirst();
                    if (node.left != null) {
                        deque.offerLast(node.left);
                    }
                    if (node.right != null) {
                        deque.offerLast(node.right);
                    }
                }
                list.add(node.val);
            }
            depth++;
            result.add(list);
        }
        return result;
    }
}
