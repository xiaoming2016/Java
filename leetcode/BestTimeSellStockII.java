 public class BestTimeSellStockII {
 /*
 思路：只要这次股票卖出价低于前一次买入价，就交易，并不断累加
 */
 public int maxProfit(int[] prices) {
        int res=0;
            for(int i=1;i<prices.length;i++){
                
                if(prices[i]>prices[i-1]){
                    res+=prices[i]-prices[i-1];
                }
            }
        return res;
    }
   }
