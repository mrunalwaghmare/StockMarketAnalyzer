import java.util.*;

public class StockMarketAnalyzer {

    public static void findBestBuySellDays(int prices[]) {
        if (prices.length == 0) {
            System.out.println("No data available.");
            return;
        }

        int minPrice = prices[0];   // Minimum price so far
        int maxProfit = 0;          // Max profit so far
        int buyDay = 0;
        int sellDay = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
                sellDay = i;
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i];
                buyDay = i;
            }
        }

        if (maxProfit > 0) {
            System.out.println("Buy on day " + buyDay + " at price " + prices[buyDay]);
            System.out.println("Sell on day " + sellDay + " at price " + prices[sellDay]);
            System.out.println("Maximum Profit = " + maxProfit);
        } else {
            System.out.println("No profitable transaction possible.");
        }
    }

    public static void main(String[] args) {
        // Example: Stock prices for 7 days
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        findBestBuySellDays(prices);
    }
}
