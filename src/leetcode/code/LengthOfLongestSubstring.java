package leetcode.code;

import java.util.HashMap;
import java.util.Map;

/**
 * Title : leetcode.code <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-29 13:32
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        int max = 0;
        Map<Character, Integer> map = new HashMap<>(size * 2);
        for (int start = 0, end = 0; end < size; end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c));
            }
            max = Math.max(max, end - start + 1);
            map.put(c, end + 1);
        }
        return max;
    }
}
