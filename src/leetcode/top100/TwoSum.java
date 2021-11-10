package leetcode.top100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Title : leetcode.top100 <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description : 两数之和
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-10 15:43
 */
public class TwoSum {
    /**
     * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     */

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum2(new int[]{3, 5, 1, 7}, 4)));
    }
}
