class Solution {
    public int maxProfit(int[] prices) {
        int buy = -prices[0];
        int rest = 0;
        int sell = 0;
        for(int p : prices){
            buy = Math.max(buy,rest-p);
            rest = Math.max(rest, sell);
            sell = Math.max(sell,buy+p);
        }
        return sell;
    }
}