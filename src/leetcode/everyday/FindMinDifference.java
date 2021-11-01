package leetcode.everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Title : leetcode.everyday <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description : 剑指 Offer II 035. 最小时间差
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-29 18:08
 */
public class FindMinDifference {

    public static int findMinDifference(List<String> timePoints) {
        int res = 24 * 60;
        if (timePoints.size() <= 1) {
            return res;
        }
        List<Integer> list = new ArrayList<>();
        for (String timePoint : timePoints) {
            list.add(Integer.parseInt(timePoint.substring(0, 2)) * 60 + Integer.parseInt(timePoint.substring(3, 5)));
        }
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            int def = list.get(i) - list.get(i - 1);
            if (def > 12 * 60) {
                def = 24 * 60 - def;
            }
            res = Math.min(res, def);
        }
        int def = list.get(list.size() - 1) - list.get(0);
        if (def > 12 * 60) {
            def = 24 * 60 - def;
        }
        res = Math.min(res, def);
        return res;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("00:00", "04:00", "22:00");
        System.out.println(findMinDifference(list));
    }
}
