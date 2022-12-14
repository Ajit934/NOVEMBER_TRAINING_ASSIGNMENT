package com.yash.java8;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSort_Q_9 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(2);
		al.add(1);
		al.add(9);
		al.add(3);
		System.out.println("Elements of the ArrayList " + "before sorting : " + al);

		Collections.sort(al, (o1, o2) -> (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0);

		System.out.println("Elements of the ArrayList after" + " sorting : " + al);
	}
}