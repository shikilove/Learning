package company.tiktok;

/**
 * Title : company.tiktok <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description : Coins in Line II 硬币排成线 II
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-27 14:01
 */
public class CoinsInLine {

    public static boolean firstWillWin(int[] values) {
        int length = values.length;
        if (length <= 2) {
            return true;
        }
        int[] dp = new int[length + 1];
        dp[length] = 0;
        dp[length - 1] = values[length - 1];
        dp[length - 2] = values[length - 1] + values[length - 2];
        dp[length - 3] = values[length - 3] + values[length - 2];
        for (int i = length - 4; i >= 0; i--) {
            dp[i] = values[i] + Math.min(dp[i + 1], dp[i + 2]);
            dp[i] = Math.max(dp[i], values[i] + values[i + 1] + Math.min(dp[i + 2], dp[i + 3]));
        }
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return dp[0] > sum - dp[0];

    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(firstWillWin(arr));
    }
}
