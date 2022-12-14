package com.yash.test;

import java.util.Calendar;
import java.util.Scanner;

import com.yash.model.Employee;
import com.yash.service.EmployeeImpl;
import com.yash.service.IEmployee;
import com.yash.service.IEmployee;

public class Employee_Test {
	
   
	public static void main(String[] args) {
		IEmployee emp=new EmployeeImpl();
//		Employee e1= new Employee(101, "Sai","Hyder", 80000, "Java ");
//	  //emp.save_Emp(e1);
//	 // emp.view_Emp();
//	 //System.out.println( emp.edit_Emp(101));
//	 emp.getOne_Emp(101);
//	 System.out.println(emp.delet_Emp(101));
		Scanner sc = new Scanner(System.in);
		int choice, exit=0, option;
		System.out.println("***WEL-COME TO EMPLOYEE MANAGEMENT SYSTEM***");
		Calendar calendar =Calendar.getInstance();
		System.out.println("Date: "+calendar.getTime());
		
		while(exit==0) {
			System.out.println("Press 1 for Registration \n Press 2 for view particular Employee \n Press 3 to get all employees list \n Press 4 for edit a employee \n Press 5 for delete a  employee ");
			choice  = sc.nextInt();
			switch(choice) {
			case 1:
				int id, salary;
				String name, address, designation;
				System.out.println("Enter employee id: ");
				id = sc.nextInt();
				System.out.println("Enter employee name: ");
				name = sc.next();
				System.out.println("Enter employee address: ");
				address = sc.next();
				System.out.println("Enter employee salary: ");
				salary = sc.nextInt();
				System.out.println("Enter employee Designation: ");
				designation = sc.next();
				Employee e= new Employee(id, name, address, salary, designation);
				emp.save_Emp(e);
				break;
			
			case 2:
				int id1;
				System.out.println("Enter employee id to view details: ");
				id1 = sc.nextInt();
				emp.getOne_Emp(id1);
				break;
				
			case 3:
				emp.view_Emp();
				break;
				
			case 4:
				int id2;
				System.out.println("Edit employee details");
				id2 = sc.nextInt();
				System.out.println(emp.edit_Emp(id2));
				break;
				
			case 5:
				int id3;
				System.out.println("Delete employee details");
				id3 = sc.nextInt();
				emp.delet_Emp(id3);
				break;
				
				}
			System.out.println("Press 1 for menu and 0 for exit");
			if(sc.nextInt()==0) {
				System.out.println("Exiting the employee management system");
				break;
			}
		}

	}

}
