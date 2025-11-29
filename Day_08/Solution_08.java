package Day_08;

class Solution_008 {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        int minPrice = prices[0];
        int maxProfit = 0;
        
        if (prices == null || prices.length == 0) {
            return 0;
        }

        for (int i = 1; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}