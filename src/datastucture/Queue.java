package datastucture;

import java.util.Stack;

/**
 * Title : datastucture <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description : 用两个栈创建队列
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-19 15:07
 */
public class Queue {

    Stack<Integer> stack1;

    Stack<Integer> stack2;

    public Queue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void add(int val) {
        stack1.push(val);
    }

    public int get() {
        if (isEmpty()) {
            throw new RuntimeException("the queue is empty");
        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

}
