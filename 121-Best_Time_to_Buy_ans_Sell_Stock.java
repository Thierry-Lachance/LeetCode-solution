class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = -1;
        int max = -1;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min || min == -1){
                min = prices[i];
                max = 0;
                for(int f = i+1; f < prices.length; f++){
                    if((prices[f] - prices[i]) > max)max = (prices[f] - prices[i]);
                }
            }
        if(max > profit)profit = max;
        }
        return profit;  
        }   
    }
