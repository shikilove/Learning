package company.meituan;

import java.util.Arrays;

/**
 * Title : company.meituan <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :在排序数组中查找元素的第一个和最后一个位置
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-28 15:06
 */
public class SearchRange {

    /**
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     * 如果数组中不存在目标值 target，返回[-1, -1]。
     */
    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = {-1, -1};
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                int temp = mid;
                while (mid >= 0 && nums[mid] == target) {
                    mid--;
                }
                res[0] = mid + 1;
                while (temp <= nums.length - 1 && nums[temp] == target) {
                    temp++;
                }
                res[1] = temp - 1;
                break;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(Arrays.toString(searchRange(arr, 1)));
        System.out.println(3 | 2);
    }
}
