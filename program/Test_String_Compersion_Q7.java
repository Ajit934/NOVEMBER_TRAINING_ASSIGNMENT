package com.yash.oops.program;

import java.util.Scanner;

public class Test_String_Compersion_Q7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first String");

		String str1 = scanner.nextLine();

		System.out.println("Enter Second String");

		String str2 = scanner.nextLine();

		StringComper st = new StringComper();
		st.stringCompare(str1, str2);


	}

}
