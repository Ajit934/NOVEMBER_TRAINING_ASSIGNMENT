package com.yash.collection.program;

import java.util.Comparator;

public class CompareItem_Q5 implements Comparator<Item_Q_5>{

	@Override
	public int compare(Item_Q_5 o1, Item_Q_5 o2) {
		if (o1.getId() == o2.getId())
			return 0;
		else if (o1.getId() > o2.getId())
			return 1;

		else
			return -1;
	}


}
