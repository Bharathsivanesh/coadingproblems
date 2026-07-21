package CoreJava.leetcodes.patterns.arrays;

public class Buystock2 {

    public static int maxProfit(int[] prices) {

        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i-1]<=prices[i])
            {
                profit+=prices[i]-prices[i-1];
            }

        }
        return profit;
    }
    public static void main(String[] args)
    {
        int []n={7,1,5,3,6,4};
        int result=maxProfit(n);
        System.out.print(result);
    }
}
