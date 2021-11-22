package leetcode.everyday;

/**
 * Title : leetcode.everyday <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-19 18:19
 */
public class IntegerReplacement {
    /**
     * 给定一个正整数n ，你可以做如下操作：
     * <p>
     * 如果n是偶数，则用n / 2替换n 。
     * 如果n是奇数，则可以用n + 1或n - 1替换n 。
     * n变为 1 所需的最小替换次数是多少？
     */

    public int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return integerReplacement(n / 2) + 1;
        }
        return 1 + Math.min(integerReplacement(n - 1), integerReplacement(n + 1));
    }

    public int integerReplacement2(int n) {
        int res = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                res++;
                n /= 2;
            } else if (n % 2 == 1) {
                res += 2;
                n /= 2;
            } else {
                if (n == 3) {
                    res += 2;
                    n = 1;
                } else {
                    res += 2;
                    n = n / 2 + 1;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(new IntegerReplacement().integerReplacement2(8));
    }
}
