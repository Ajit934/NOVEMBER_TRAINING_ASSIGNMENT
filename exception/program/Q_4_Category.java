package com.yash.exception.program;

public class Q_4_Category {
	int catid;
	String categoryname;
	static int count=1;
	
	Q_4_Category(String categoryname){
		this.catid = count++;
		this.categoryname = categoryname;
	}

	@Override
	public String toString() {
		return "Item Number=" + catid + ", Item Name=" + categoryname;
	}
	
	
}

