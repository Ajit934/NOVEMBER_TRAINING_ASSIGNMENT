package com.yash.oops.program;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test_Print_Object_using_tostring_11 {

	public static void main(String[] args) {
		//Create Employee class object
		Calendar cal = Calendar.getInstance();
		Date date= cal.getTime();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yyyy");
		sdf.format(date);
		Employee e1= new Employee();
		e1.setEmpid(101);
		e1.setEmpname("Rohan");
		e1.setEmpaddress("Pune");
		e1.setEmpsalary(30000);
		e1.setEmp_dob(date);
		e1.setEmp_doj(date);
		System.out.println(e1);
		

	}

}
