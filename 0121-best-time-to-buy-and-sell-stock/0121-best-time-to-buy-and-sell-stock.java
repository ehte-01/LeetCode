class Solution {
    public int maxProfit(int[] prices) {
        
        int buy=0;
        int maxProfit=0;
        for(int sell=0;sell<prices.length;sell++){
            if(prices[sell]>prices[buy]){
                maxProfit=Math.max(maxProfit,prices[sell]-prices[buy]);
            } else{
                buy=sell;
            }
        }    
        return maxProfit;
    }
}