package com.yash.collection.program;

import java.util.Collections;
import java.util.Vector;

public class VectorSort_Q_5 {
	public static void main(String[] args) {
		Vector<Item_Q_5> vector = new Vector<>();
		vector.add(new Item_Q_5(4,"apple",20));
		vector.add(new Item_Q_5(3,"orange",15));
		vector.add(new  Item_Q_5(1,"mango",30));
		vector.add(new  Item_Q_5(5,"grapes",40));
		
		Collections.sort(vector, new CompareItem_Q5());
		for(int i=0;i<vector.size();i++) {
			int k = vector.get(i).getId();
			String name = vector.get(i).getName();
			double price = vector.get(i).getPrice();
			System.out.println("id= "+k+", name= "+name+", price= "+price);
		}
	}

}
