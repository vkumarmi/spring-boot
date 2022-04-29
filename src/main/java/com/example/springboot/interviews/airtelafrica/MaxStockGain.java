package com.example.springboot.interviews.airtelafrica;

public class MaxStockGain {
    public static void main(String[] args) {
        int [] arr={3, 1 , 4, 7, 8, 2, 5};
        System.out.println(getMaxPrice(arr));
        System.out.println(maxPrice(arr));
    }
    public static int getMaxPrice(int[] arr) {

        int maxPrice = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++)
                if (arr[j] - arr[i] > maxPrice) {
                    maxPrice = arr[j] - arr[i];
                }

        }
        return maxPrice;


    }


    public static int maxPrice(int [] arr){
        int buy;
        int sell;
        int max;

        int i=0;
        buy=i;
        sell=i;
        max=arr[sell]-arr[buy];
        while(i<arr.length-1) {
            if (arr[i + 1] < arr[i]) {
                buy = i + 1;
                sell = buy;
            }
            if (arr[i + 1] > arr[i]) {
                sell = i + 1;
            }
            if (max < arr[sell] - arr[buy])
                max = arr[sell] - arr[buy];
            i++;


        }

return max;
        }
}

