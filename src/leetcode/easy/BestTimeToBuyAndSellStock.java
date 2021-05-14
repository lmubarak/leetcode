package leetcode.easy;
/**
 *
 * @author lmubarak
 * @Date April, 24 2021
 *
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String [] args) {
        int [] prices = {7, 1, 5, 3, 6, 4};
        int dayNumberToSell = maxProfit(prices);
        System.out.println(dayNumberToSell);
    }

    /**
     *
     * @param prices
     * @return the number of the day at which to sell stock to maximize profit
     */
    public static int maxProfit(int[] prices) {
        int minIndex = 0;
        int maxProfit = 0;
        for (int i=1;i<prices.length;i++) {
            // store next min price
            if (prices[minIndex] > prices[i]) {
                minIndex = i;
            } else if(prices[i] - prices[minIndex] > maxProfit) {
                maxProfit = prices[i] - prices[minIndex];
            }
        }
        return maxProfit;
    }
}
