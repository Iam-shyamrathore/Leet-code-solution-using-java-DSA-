class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min_price = prices[0];
        
        int max_profit = 0;
        for(int i = 1 ; i<n; i++){
            
           min_price = Math.min(min_price,prices[i]);
           int profit = prices[i]-min_price;
           max_profit = Math.max(max_profit,profit);
        }
        return max_profit;
        
       

       


        
    }
}
