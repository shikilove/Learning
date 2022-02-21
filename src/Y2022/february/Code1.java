package Y2022.february;

import java.util.*;

/**
 * Title : Y2022.february <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description : 最长快乐字符串
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-7 15:07
 */
public class Code1 {
    /**
     * 如果字符串中不含有任何 'aaa'，'bbb' 或 'ccc' 这样的字符串作为子串，那么该字符串就是一个「快乐字符串」。
     * <p>
     * 给你三个整数 a，b ，c，请你返回 任意一个 满足下列全部条件的字符串 s：
     * <p>
     * s 是一个尽可能长的快乐字符串。
     * s 中 最多 有a 个字母 'a'、b个字母 'b'、c 个字母 'c' 。
     * s 中只含有 'a'、'b' 、'c' 三种字母。
     * 如果不存在这样的字符串 s ，请返回一个空字符串 ""。
     */

    public String longestDiverseString(int a, int b, int c) {
        StringBuilder res = new StringBuilder();
        Pair[] arr = {new Pair(a, 'a'), new Pair(b, 'b'), new Pair(c, 'c')};
        while (true) {
            Arrays.sort(arr, (p1, p2) -> p2.freq - p1.freq);
            boolean hasNext = false;
            for (Pair pair : arr) {
                if (pair.freq <= 0) {
                    break;
                }
                int m = res.length();
                if (m >= 2 && res.charAt(m - 2) == pair.ch && res.charAt(m - 1) == pair.ch) {
                    continue;
                }
                hasNext = true;
                res.append(pair.ch);
                pair.freq--;
                break;
            }
            if (!hasNext) {
                break;
            }
        }
        return res.toString();
    }

    static class Pair {
        int freq;
        char ch;

        public Pair(int freq, char ch) {
            this.freq = freq;
            this.ch = ch;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "freq=" + freq +
                    ", ch=" + ch +
                    '}';
        }
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        Map<String ,String > map = new HashMap<>(4);
        map.put("b",null);
        map.put("c",null);
        set.addAll(map.values());
        set.addAll(new ArrayList<>());
        System.out.println(set.size());
        System.out.println(set.toString());
    }

}
