package com.example.springboot.dsa.dp;

public class Factorial {
    public static long factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static long factorialDPBU(int n){
        long [] DP=new long[n];
        DP[0]=1;
        for(int i=2;i<=n;i++){
            DP[i-1]=i*DP[i-2];
        }
        return DP[n-1];
    }

    public static long factorialDPTD(int n){

    }

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        System.out.println(factorial(20));
        System.out.println("Time:"+(System.currentTimeMillis()-start));
        System.out.println(factorialDPBU(20));

    }

}
