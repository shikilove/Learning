package Y2022.february;

/**
 * Title : Y2022.february <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-16 15:04
 */
public class Code4 {

    /**
     * 给定一个数组 prices ，其中 prices[i] 表示股票第 i 天的价格。
     * <p>
     * 在每一天，你可能会决定购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以购买它，然后在 同一天 出售。
     * <p>
     * 返回 你能获得的 最大 利润 。
     */

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                max += prices[i + 1] - prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] princes = new int[]{1, 2, 3, 4, 5, 3};
        System.out.println(new Code4().maxProfit(princes));
    }
}
