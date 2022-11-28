package com.yash.exception.program;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter marks in maths");

		int mathMarks = scanner.nextInt();

		if (mathMarks < 0) {
			throw new Q_1_NegativeMarksException("Marks enter negative in number");
		}

		System.out.println("Enter marks in science");

		int scienceMarks = scanner.nextInt();

		if (scienceMarks < 0) {
			throw new Q_1_NegativeMarksException("Marks enter negative in number");
		}

		System.out.println("Enter marks in english");

		int englishMarks = scanner.nextInt();

		if (englishMarks < 0) {
			throw new Q_1_NegativeMarksException("Marks enter negative in number");
		}

		System.out.println("Enter marks in chemistry");

		int chemistryMarks = scanner.nextInt();

		if (chemistryMarks < 0) {
			throw new Q_1_NegativeMarksException("Marks enter negative in number");
		}

		Q_1_StudentResult sr = new Q_1_StudentResult(mathMarks, scienceMarks, englishMarks, chemistryMarks);

		Q_1_Student std = new Q_1_Student(2, "Jay", "Pune", sr);

		System.out.println(std);

		if ((mathMarks & scienceMarks) < 40 || (scienceMarks & englishMarks) < 40
				|| (chemistryMarks & englishMarks) < 40 || (chemistryMarks & mathMarks) < 40
				|| (mathMarks & englishMarks) < 40 || (scienceMarks & chemistryMarks) < 40

		) {

			System.out.println("Student Failed in Exam");

		}
		int average = (mathMarks + scienceMarks + englishMarks + chemistryMarks) / 4;
		try {
			if (average < 40) {

				throw new Q_1_FailException("Average is less than 40 percent");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

