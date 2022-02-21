package Y2022.february;

/**
 * Title : Y2022.february <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-16 16:02
 */
public class Code7 {
    /**
     * 提供一个整型数组以及一个整数s，如果该数组中存在n个连续元素，且元素相加之和大于等于s，则返回满足该条件的连续元素的最小长度；否则返回0
     */
    public int test(int[] arr, int s) {
        if (arr[0] > s) {
            return 1;
        }
        int sum = arr[0];
        int size = Integer.MAX_VALUE;
        int left = 0;
        int right = 1;
        for (; left < right && right < arr.length; ) {
            if (sum >= s) {
                sum -= arr[left];
                size = Math.min(size, right - left + 1);
                left++;
            } else {
                sum += arr[right];
            }
        }
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new Code7().test(new int[]{1, 2, 0,0, 3, 1}, 5));
    }
}
