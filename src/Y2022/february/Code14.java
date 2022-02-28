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
 * @date 2022-2-28 13:40
 */
public class Code14 {

    public static ListNode reverseList(ListNode head) {
        ListNode ret = new ListNode();
        ListNode result = ret;
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            ret.next = stack.pop();
            ret = ret.next;
        }
        ret.next = null;
        return result.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode node = reverseList(listNode1);
        listNode1.print(node);
    }
}
