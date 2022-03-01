package com.example.springboot.interviews.here.round3;

public class StockTrading {
    public static void main(String[] args) {
        int [] trade1={7,1,5,3,6,4};
        int trade2[]={1,2,3,4,5};
        int trade3[]={10,1,2,8,20,11,15,14};
        System.out.println(maxTradeProfit1(trade1));
        System.out.println(maxTradeProfit1(trade2));
        System.out.println(maxProfit2(trade1,trade1.length));
        System.out.println(maxProfit2(trade2,trade2.length));
        System.out.println(maxProfit2(trade3,trade3.length));
    }

    public static int maxTradeProfit1(int [] trade){
        int maxProfit=0;
        int i=0;
        int j=i+1;
        int sellAt=0;
        int profit=0;
        for (;j<trade.length;){
            if(trade[j]-trade[i]>profit){
                profit=trade[j]-trade[i];
                sellAt=j;
                sellAt=
                j++;
            }else if(j==trade.length-1)
                {
                    if(profit>0) {
                        maxProfit = maxProfit + profit;
                            profit=0;
                        i=sellAt;
                        j=i+1;
                    }else {
                        i++;
                        j = i + 1;
                    }
                }else{
                j++;
            }
            }

        return maxProfit;
    }

    static int maxProfit2(int prices[], int size)
    {

        // maxProfit adds up the difference between
        // adjacent elements if they are in increasing order
        int maxProfit = 0;

        // The loop starts from 1
        // as its comparing with the previous
        for (int i = 1; i < size; i++)
            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        return maxProfit;
    }
}
