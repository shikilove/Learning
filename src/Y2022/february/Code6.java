package Y2022.february;

/**
 * Title : Y2022.february <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-16 15:24
 */
public class Code6 {
    /**
     * 给定m个不重复的字符 [a, b, c, d]，以及一个长度为n的字符串tbcacbdata，
     * 问能否在这个字符串中找到一个长度为m的连续子串，使得这个子串刚好由上面m个字符组成，顺序无所谓，返回任意满足条件的一个子串的起始位置，
     * 未找到返回-1。比如上面这个例子，acbd，3。给定m个可能重复的字符[a, b, d, d]呢？
     *
     */

    public int test(String[] arr, String str) {
        if (str == null || str.length() < arr.length) {
            return -1;
        }
        for (int left = 0; left < str.length()-arr.length; left++) {
            String sub = str.substring(left, left+ arr.length);
            boolean flag = true;
            for (String s : arr) {
                if (!sub.contains(s)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return left;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Code6().test(new String[]{"a", "b", "c", "d"}, "tbcacbdata"));
    }
}
