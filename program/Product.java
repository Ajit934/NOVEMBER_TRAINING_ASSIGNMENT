package com.yash.oops.program;

public class Product implements Cloneable {
	int pid;
	String pname;
	int price;
	String unitOfMeasurement;

	public Product(int pid, String pname, int price, String unitOfMeasurement) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		try {
			Product p = new Product(1, "ram", 30000, "rs");

			Product p1 = (Product) p.clone();

			System.out.println(p.pname + " " + p.pname);
			System.out.println(p1.price + " " + p1.price);

			String pname = "asdd";
			boolean re1 = pname instanceof String;
			System.out.println("pname is instance of String" + re1);
			boolean re2 = p instanceof Product;
			System.out.println("pname is instance of string" + re2);
		} catch (CloneNotSupportedException c) {
		}

	}
}
