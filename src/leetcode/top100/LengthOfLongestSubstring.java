package leetcode.top100;

import java.util.HashMap;
import java.util.Map;

/**
 * Title : leetcode.top100 <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-10 16:16
 */
public class LengthOfLongestSubstring {
    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     */

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

    public static void main(String[] args) {
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("abcabcbb"));
    }
}
