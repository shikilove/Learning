package Y2022.february;

import java.util.Arrays;

/**
 * Title : Y2022.february <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-28 14:42
 */
public class Code15 {
    /**
     * 2n 个无序的数，n 个奇数，n 个偶数，实现一个算法：奇数在奇数位，偶数在偶数位
     */
    public static void code(int[] arr) {
        int even = 1;
        int odd = 0;
        for (; even < arr.length; even += 2) {
            if (arr[even] % 2 == 1) {
                for (; odd < arr.length; odd += 2) {
                    if (arr[odd] % 2 == 0) {
                        int temp = arr[even];
                        arr[even] = arr[odd];
                        arr[odd] = temp;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5};
        code(arr);
        System.out.println(Arrays.toString(arr));
    }

}
