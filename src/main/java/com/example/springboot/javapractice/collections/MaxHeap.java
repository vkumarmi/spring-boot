package com.example.springboot.javapractice.collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxHeap {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.poll());

    }
}
