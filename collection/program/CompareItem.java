package com.yash.collection.program;

import java.util.Comparator;

public class CompareItem implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		if (o1.getId() == o2.getId())
			return 0;
		else if (o1.getId() > o2.getId())
			return 1;

		else
			return -1;
	}

}
