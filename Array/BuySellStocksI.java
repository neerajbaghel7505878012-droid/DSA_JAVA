package array;

public class BuySellStocks {
    public static int BuyandSellStocks(int prices[]){
       int profit=0;
        int maxprofit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            buy=Math.min(prices[i], buy);
           profit=prices[i]-buy;
            if(maxprofit<profit){
                maxprofit=profit;
            }
        }
        return maxprofit;
        }
        
    
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
    int result=    BuyandSellStocks(prices);
System.out.println(result);
    }
}
