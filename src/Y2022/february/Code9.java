package Y2022.february;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Title : Y2022.february <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-16 18:27
 */
public class Code9 {
    /**
     * 第k大的数
     */
    public int findKth(int[] a, int n, int k) {
        // write code here
        PriorityQueue<Integer> heap = new PriorityQueue<>(k, Comparator.comparingInt(t -> t));
        for (int j : a) {
            if (heap.size() < k) {
                heap.add(j);
            } else if (j > heap.peek()) {
                heap.poll();
                heap.add(j);
            }
        }
        return heap.remove();
    }

    public static void main(String[] args) {
        System.out.println(new Code9().findKth(new int[]{1, 3, 9, 2}, 4, 2));
    }
}
