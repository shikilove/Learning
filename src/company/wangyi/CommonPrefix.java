package company.wangyi;

/**
 * Title : company.wangyi <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-5 15:56
 */
public class CommonPrefix {
    // 求字符串公共前缀，例如  ['abcaaa', 'abcddd', 'abcadad'] ==> 'abc'

    public static String commonPrefix(String[] arr) {
        if (arr.length <= 0) {
            return "";
        }
        String shortest = arr[0];
        for (String s : arr) {
            shortest = shortest.length() <= s.length() ? shortest : s;
        }
        StringBuilder common = new StringBuilder();
        char[] chars = shortest.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (String s : arr) {
                if (chars[i] != s.charAt(i)) {
                    return common.toString();
                }
            }
            common.append(chars[i]);
        }
        return common.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"aaaa", "bcddd", "abcadad"};
        System.out.println(commonPrefix(arr));
    }
}
