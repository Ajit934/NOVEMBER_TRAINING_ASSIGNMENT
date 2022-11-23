package com.yash.oops.program;

public class Finalize_Q9 {

	public static void main(String[] args) {
		Employee_FinalizeQ9 e1 = new Employee_FinalizeQ9(101);
		Employee_FinalizeQ9 e2 = new Employee_FinalizeQ9(102);
		Employee_FinalizeQ9 e3 = new Employee_FinalizeQ9(103);
		Employee_FinalizeQ9 e4 = new Employee_FinalizeQ9(104);
		Employee_FinalizeQ9 e5 = new Employee_FinalizeQ9(105);

		e2 = null;
		e5 = null;
		System.gc();

		for (int i = 1; i < 6; i++) {
			String e = "e" + i;
			System.out.println(e + ":" + e.hashCode());
		}
		System.out.println("e2=" + e2);
		System.out.println("e5=" + e5);

	}


}
