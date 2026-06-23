class Solution {
    public int maxProfit(int[] prices) {
       int profit = 0;
       int l = 0;
       int r = 1;
       while(r < prices.length){
            profit = Math.max(profit, prices[r] - prices[l]);
            if(prices[l] > prices[r]){
                l = r;
                r++;
            } else{
                r++;
            }
       }
       return profit;
    }
}
