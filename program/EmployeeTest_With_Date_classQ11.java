package com.yash.oops.program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class EmployeeTest_With_Date_classQ11 {

	public static void main(String[] args) throws ParseException {
		Employee e1= new Employee();
		e1.setEmpid(101);
		e1.setEmpname("Rakesh");
		e1.setEmpaddress("Pune");
		e1.setEmpsalary(20000);
		e1.setEmp_doj(null);
		String dateString = "01/08/1985";

		String datString="01/07/2022";
		//class definition here, etc...    formatter = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat   formatter = new SimpleDateFormat("dd/MM/yyyy");

		e1.setEmp_dob(formatter.parse(dateString));
		e1.setEmp_doj(formatter.parse(datString));
		System.out.println(e1);


	}

}
