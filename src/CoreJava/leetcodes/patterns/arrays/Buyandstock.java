package CoreJava.leetcodes.patterns.arrays;

public class Buyandstock {

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            profit = prices[i] - min;

            if (profit > max) {
                max = profit;
            }
        }

        return max;
    }
    public static void main(String[] args) {


        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}