package leetcode.top100;

import domain.ListNode;

/**
 * Title : leetcode.top100 <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description : 两数相加
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-10 16:01
 */
public class AddTwoNumbers {
    /**
     * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
     * <p>
     * 请你将两个数相加，并以相同形式返回一个表示和的链表。
     * <p>
     * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
     */

    int carry = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        if (l1 == null && l2 != null && carry == 0) {
            return l2;
        }
        if (l1 != null && l2 == null && carry == 0) {
            return l1;
        }
        int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
        int value = sum % 10;
        carry = sum / 10;
        ListNode node = new ListNode(value);
        node.next = addTwoNumbers((l1 == null ? null : l1.next), (l2 == null ? null : l2.next));
        return node;
    }
}
