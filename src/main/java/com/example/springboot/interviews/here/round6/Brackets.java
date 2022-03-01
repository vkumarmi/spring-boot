package com.example.springboot.interviews.here.round6;

import org.springframework.util.Assert;

import java.util.*;

//[[]][]
//[[start_index, end_index, [start_index, end_index, null]]
//[[0,3,[1, 2, null]],[4,5,null]]

//[[][]][][]
//[[0,5,[1,2,null],[3,4,null]],[6,7,null],[8,9,null]]
public class Brackets {

    public static void main(String[] args) {
        String argument1 ="[[]][]";
        String argument2="[[][]][][]";
        Assert.isTrue("[[0,3,[1,2,null]],[4,5,null]]".equalsIgnoreCase(bucketFormatting(argument1)));
        //System.out.println(bucketFormatting(rgs));
    }

    public static String bucketFormatting(String args){
        Stack<Integer> openingIndex=new Stack<>();
        Stack<String> intermediateResult=new Stack<>();
        Queue<String> finalResult=new LinkedList<>();
        StringBuffer resultBuffer=new StringBuffer();
        int size=args.length();
        int i=0;
        while (i<size){
            if(args.charAt(i)=='['){
                openingIndex.push(i);
            }
            if(args.charAt(i)==']'){
                resultBuffer.append("[");
               resultBuffer.append(openingIndex.pop())
               .append(",")
                       .append(i)
                       .append(",");
               if(intermediateResult.isEmpty()) {
                       resultBuffer.append("null");
               }else{
                   resultBuffer.append(intermediateResult.pop());
               }
                       resultBuffer.append("]");

            }
            if(!resultBuffer.toString().isEmpty() && !openingIndex.isEmpty()){
                intermediateResult.push(resultBuffer.toString());
                resultBuffer=new StringBuffer();
            }
            else if(!resultBuffer.toString().isEmpty() && openingIndex.isEmpty()){
                finalResult.add(resultBuffer.toString());
                finalResult.add(",");
                resultBuffer=new StringBuffer();
            }
            i++;

        }
        StringBuffer buffer=new StringBuffer();
        buffer.append("[");
        while (!finalResult.isEmpty()){
            if(finalResult.peek().equals(",")){
                finalResult.poll();
            }
            buffer.append(finalResult.poll());
        }
        buffer.append("]");
        return buffer.toString();
    }
}
