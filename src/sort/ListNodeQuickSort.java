package sort;

import domain.ListNode;

/**
 * Title : sort <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-25 17:50
 */
public class ListNodeQuickSort {

    public static ListNode sortList(ListNode head) {
        quickSort(head, null);
        return head;
    }

    public static void quickSort(ListNode head, ListNode end) {
        if (head != end) {
            ListNode node = divide(head, end);
            quickSort(head, node);
            quickSort(node.next, end);
        }

    }

    public static ListNode divide(ListNode head, ListNode end) {
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p2 != end){
            if (p2.val < head.val){
                p1 = p1.next;
                int temp = p1.val;
                p1.val = p2.val;
                p2.val = temp;
            }
            p2 = p2.next;
        }
        if (p1 != head){
            int temp = p1.val;
            p1.val = head.val;
            head.val = temp;
        }
        return p1;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        sortList(node1);

        while (node1 != null) {
            System.out.println(node1.val);
            node1 = node1.next;
        }
    }
}
