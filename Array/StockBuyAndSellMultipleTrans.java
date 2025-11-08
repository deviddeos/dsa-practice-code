class InnerStockBuyAndSellMultipleTrans {

  public void multipleTransaction() {
    int num[] = { 100, 180, 260, 310, 40, 535, 695 };
    int totalProfit = 0;

    for (int i = 1; i < num.length; i++) {
        if (num[i] > num[i-1]) {
            totalProfit += num[i] - num[i-1];
        }
    }
    
    System.out.println(totalProfit);
  }
}

public class StockBuyAndSellMultipleTrans {

  public static void main(String[] args) {
    InnerStockBuyAndSellMultipleTrans d = new InnerStockBuyAndSellMultipleTrans();
    d.multipleTransaction();
  }
}
