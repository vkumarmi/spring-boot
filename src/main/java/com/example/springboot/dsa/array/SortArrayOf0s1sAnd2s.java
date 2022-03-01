package com.example.springboot.dsa.array;

public class SortArrayOf0s1sAnd2s {


    public static void sort012(int a[], int n)
    {
        int left=0;
        int right=n-1;
        int mid=left+1;
        int temp;

        if(n==0 || n==1 ){
            return;
        }
        while(mid<=right){
            if(a[mid]==0){
                if(a[left]!=0){
                    temp=a[mid];
                    a[mid]=a[left];
                    a[left]=temp;
                    left++;
                }else
                {
                    left++;
                    mid++;
                }
            }
            if(a[mid]==1){
                mid++;
            }
            if(a[mid]==2){
                if(a[right]!=2){
                    temp=a[mid];
                    a[mid]=a[right];
                    a[right]=temp;
                    right--;
                }else{
                    //mid++;
                    right--;
                }
            }
            if(left==mid && a[left]==a[mid]){
                mid++;
            }
        }
    }
}
