public class buyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int mini = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length ; i++){
            int profit = prices[i] - mini;
            maxProfit = Math.max(profit , maxProfit);
            mini = Math.min(mini , prices[i]);
        }
        System.out.println(maxProfit);
    }
}
