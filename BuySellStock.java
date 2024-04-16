public class BuySellStock {

  public static void main(String args[]) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    System.out.println(maxProfit(prices));
  }

  public static int maxProfit(int[] prices) {
    int minValue = Integer.MAX_VALUE;
    int tp = 0;
    int ans = 0;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minValue) {
        minValue = prices[i];
      }
      tp = prices[i] - minValue;
      if (tp > ans) {
        ans = tp;
      }
    }

    return ans;
  }
}

class Solution {

  public int maxProfit(int[] prices) {
    int lsf = Integer.MAX_VALUE;
    int op = 0;
    int pist = 0;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < lsf) {
        lsf = prices[i];
      }
      pist = prices[i] - lsf;
      if (op < pist) {
        op = pist;
      }
    }
    return op;
  }
}
