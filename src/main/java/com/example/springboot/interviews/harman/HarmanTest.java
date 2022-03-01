package com.example.springboot.interviews.harman;
//Given a string, find the length of the longest substring without repeating characters.
//Input: s = "abcabcbb"
//Output: 3

public class HarmanTest {


    public static void main(String[] args) {
        System.out.println(longestSubstring("aabcacbcbxy"));
    }
    public static String longestSubstring(String argument){
        int i=0;
        String max="";
        StringBuffer result=new StringBuffer();
        while (i<argument.length()){
            if(result.toString().indexOf(argument.charAt(i))>=0){
                if(max.length()<result.toString().length()){
                    max=result.toString();
                    result=new StringBuffer();
                    result.append(argument.charAt(i));
                }
                else
                {
                    result=new StringBuffer();
                    result.append(argument.charAt(i));
                }
                i++;


            }
            else{
                result.append(argument.charAt(i));
                i++;
            }
            //System.out.println(result.toString());
        }
        if(max.length()<result.toString().length()){
            max=result.toString();
        }
        return max;
    }
}
