package leetcode.top100;

/**
 * Title : leetcode.top100 <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description : 寻找两个正序数组的中位数
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-10 16:38
 */
public class FindMedianSortedArrays {

    /**
     * 给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
     * <p>
     * 算法的时间复杂度应该为 O(log (m+n)) 。
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int left = -1;
        int right = -1;
        int mStart = 0;
        int nStart = 0;
        for (int i = 0; i <= (m + n) / 2; i++) {
            left = right;
            if (mStart < m && (nStart >= n || nums1[mStart] < nums2[nStart])) {
                right = nums1[mStart++];
            } else {
                right = nums2[nStart++];
            }
        }
        if ((m + n) % 2 == 1) {
            return right;
        }
        return (left + right) / 2.0;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 3, 5, 6,7};
        int[] num2 = {4};
        System.out.println(new FindMedianSortedArrays().findMedianSortedArrays(num1, num2));
    }
}
