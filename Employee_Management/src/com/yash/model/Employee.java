package com.yash.model;

import javax.annotation.processing.Generated;

public class Employee {

	private int Emp_id;
	private String emp_name;
	private String emp_add;
	private int sal;
	private String emp_design;

	public Employee(int emp_id, String emp_name, String emp_add, int sal, String emp_design) {
		super();
		Emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_add = emp_add;
		this.sal = sal;
		this.emp_design = emp_design;
	}

	public int getEmp_id() {
		return Emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public String getEmp_add() {
		return emp_add;
	}

	public int getSal() {
		return sal;
	}

	public String getEmp_design() {
		return emp_design;
	}

}
