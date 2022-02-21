package Y2022.february;

/**
 * Title : Y2022.february <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-14 17:56
 */
public class Code2 {

    /**
     * 给定两个字符串str1和str2,输出两个字符串的最长公共子串
     * 题目保证str1和str2的最长公共子串存在且唯一。
     * <p>
     * 输入：
     * "1AB2345CD","12345EF"
     * "2345"
     */

    public String LCS(String str1, String str2) {
        if (str2.length() > str1.length()) {
            String temp = str2;
            str2 = str1;
            str1 = temp;
        }
        return t(str1, str2);
    }

    public String t(String s1, String s2) {
        if (s1.contains(s2)) {
            return s2;
        }
        String t1 = t(s1, s2.substring(1));
        String t2 = t(s1, s2.substring(0, s2.length() - 1));

        return t1.length() > t2.length() ? t1 : t2;
    }

    public static void main(String[] args) {
        System.out.println(new Code2().t("1AB23415CD", "12345EF"));
    }
}
