import java.util.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock_121 {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];

            if (price < minPrice) {
                minPrice = price;
            }

            int profit = price - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;

    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        Best_Time_to_Buy_and_Sell_Stock_121 solution = new Best_Time_to_Buy_and_Sell_Stock_121();
        int k = solution.maxProfit(prices);

        System.out.println("Max profit: " + k);

    }
}
