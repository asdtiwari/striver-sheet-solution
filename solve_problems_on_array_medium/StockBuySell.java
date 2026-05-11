/* Stock Buy And Sell

Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Examples
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note: That buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
*/

public class StockBuySell {
	public static int getMaxProfit(int[] prices) {
		int maxProfit = 0;
		int buyAt = 0;

		for (int today = 0; today < prices.length; ++today) {
			int currProfit = prices[today] - prices[buyAt];
			if (currProfit > maxProfit) {
				maxProfit = currProfit;
			}

			if (prices[today] < prices[buyAt]) {
				buyAt = today;
			}
		}

		return maxProfit;
	}
	public static void main(String[] args) {
		int[] prices = {7,6,4,3,1};

		IO.println("Given prices of consecutive days");
		IO.println(java.util.Arrays.toString(prices));

		IO.print("Max profit: ");
		IO.println(StockBuySell.getMaxProfit(prices));
	}
}