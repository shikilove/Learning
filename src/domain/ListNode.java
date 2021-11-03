package domain;

/**
 * Title : domain <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description : 链表
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-25 17:50
 */
public class ListNode {

    public ListNode pre;

    public ListNode next;

    public int val;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
