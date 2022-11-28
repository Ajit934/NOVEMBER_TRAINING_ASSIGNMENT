package com.yash.exception.program;

public class Q_4_Item {
	private String itemName;
	private double price;
	private int maximumNumberOfItem;
	Q_4_Category category;

	public Q_4_Item(String itemName, double price, int maximumNumberOfItem) {
		super();
		this.category = new Q_4_Category(itemName);
		this.itemName = itemName;
		this.price = price;
		this.maximumNumberOfItem = maximumNumberOfItem;
	}

	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public int getMaximumNumberOfItem() {
		return maximumNumberOfItem;
	}
	
	public Q_4_Category getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + ", maximumNumberOfItem=" + maximumNumberOfItem + "]";
	}

}

