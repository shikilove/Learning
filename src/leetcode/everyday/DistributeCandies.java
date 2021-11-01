package leetcode.everyday;

import java.util.HashMap;
import java.util.Map;

/**
 * Title : leetcode.everyday <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-1 15:04
 */
public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : candyType) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return Math.min(map.size(), candyType.length / 2);
    }
}
