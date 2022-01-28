package com.example.springboot.interviews.here.round1;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	CustomArrayList<Integer> customArrayList=new CustomArrayList<>();
	for (int i=1;i<20;i++){
		customArrayList.add(i);
	}
	customArrayList.remove(10);
        System.out.println(customArrayList.get(0));
		Iterator<Integer> iterator=customArrayList.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		customArrayList.remove(10);
		customArrayList.remove(10);
		customArrayList.remove(10);
		customArrayList.remove(10);

		System.out.println(customArrayList.size());
    }

}
