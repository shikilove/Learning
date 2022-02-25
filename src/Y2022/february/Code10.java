package Y2022.february;

import domain.ListNode;

import java.util.Stack;

/**
 * Title : Y2022.february <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-24 17:58
 */
public class Code10 {

    /**
     * 每K个元素，链表翻转一次 (1, 2, 3, 4, 5, 6 k=2) -> 2 1 4 3 6 5
     */

    public ListNode reverse(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        ListNode ret = new ListNode();
        ListNode node = ret;
        while (head != null) {
            stack.push(head);
            if (stack.size() == k) {
                while (!stack.isEmpty()) {
                    ret.next = new ListNode(stack.pop().val);
                    ret = ret.next;
                }
            }
            head = head.next;
        }
        return node.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode reverse = new Code10().reverse(node1, 2);
        new ListNode().print(reverse);
    }
}
