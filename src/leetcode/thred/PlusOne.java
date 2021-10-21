package leetcode.thred;

import java.util.Arrays;

/**
 * Title : leetcode.thred <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-21 15:05
 */
public class PlusOne {

    /**
     * leetcode 66
     * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
     * <p>
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     * <p>
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     * <p>
     * 输入：digits = [1,2,3]
     * 输出：[1,2,4]
     * 解释：输入数组表示数字 123。
     */

    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        int count = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                break;
            }
            count++;
        }
        if (count == 0) {
            digits[length - 1] = digits[length - 1] + 1;
        } else if (count == length) {
            digits = new int[length + 1];
            digits[0] = 1;
            for (int i = 0; i < length; i++) {
                digits[i + 1] = 0;
            }
        } else {
            for (int i = 1; i <= count; i++) {
                digits[length - i] = 0;
            }
            digits[length - count - 1] = digits[length - count - 1] + 1;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

}
