package leetcode.everyday;

import java.util.Arrays;

/**
 * Title : leetcode.everyday <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-26 10:27
 */
public class NextGreaterElement {

    /**
     * 给你两个 没有重复元素 的数组nums1 和nums2，其中nums1是nums2的子集。
     * <p>
     * 请你找出 nums1中每个元素在nums2中的下一个比其大的值。
     * <p>
     * nums1中数字x的下一个更大元素是指x在nums2中对应位置的右边的第一个比x大的元素。如果不存在，对应位置输出 -1 。
     */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ret = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean flag = false;
            ret[i] = -1;
            for (int k : nums2) {
                if (flag && nums1[i] < k) {
                    ret[i] = k;
                    break;
                }
                if (nums1[i] == k) {
                    flag = true;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
