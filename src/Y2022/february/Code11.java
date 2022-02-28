package Y2022.february;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Title : Y2022.february <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-25 13:44
 */
public class Code11 {
    /**
     * 算法题 [1,21,3,4,211,9] 输出 数组中元素拼接后最大值
     */

    public static String getMaxConcat(List<Integer> list) {
        return list.stream().sorted((x, y) -> {
            String s1 = x.toString();
            String s2 = y.toString();
            for (int i = 0; i < Math.max(s1.length(), s2.length()); i++) {
                if (i >= s1.length()) {
                    return -1;
                }
                if (i >= s2.length()) {
                    return 1;
                }
                if (s1.charAt(i) - '0' > s2.charAt(i) - '0') {
                    return -1;
                }
                if (s1.charAt(i) - '0' < s2.charAt(i) - '0') {
                    return 1;
                }
            }
            return 0;
        }).map(Object::toString).collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        System.out.println(getMaxConcat(Arrays.asList(1, 21, 3, 4, 211, 9)));
    }
}
