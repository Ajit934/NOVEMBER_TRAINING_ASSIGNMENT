package com.yash.collection.program;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch_Q_2 {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(5);
		arr.add(10);
		arr.add(15);
		arr.add(20);
		arr.add(25);
		arr.add(30);
		arr.add(35);

		int value = 25;
		int result = Collections.binarySearch(arr, value);
		System.out.println(result);
	}


}
