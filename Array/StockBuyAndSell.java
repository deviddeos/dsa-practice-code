class InnerStockBuyAndSell {
    public void maxTransaction() {
        int prices[] ={1, 3, 6, 9, 11} ;
        int n = prices.length;
        int max = -1;
        int buyDay = 0, sellDay = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int profit = prices[j]-prices[i];
                if (profit > max) {
                    max = profit;
                    buyDay = i;
                    sellDay = j;
                }
            }
        }
        System.out.println("Buy on day " + (buyDay + 1) + " at price " + prices[buyDay]);
        System.out.println("Sell on day " + (sellDay + 1) + " at price " + prices[sellDay]);
        System.out.println("profit is: "+max);
    }
}

public class StockBuyAndSell {
    public static void main(String[] args) {
        InnerStockBuyAndSell d= new InnerStockBuyAndSell();
        d.maxTransaction();
    }
}
