package com.yash.oops.program;

import java.util.Date;

public class Employee {
	int empid;
	String empname;
	float empsalary;
	String empaddress;
	Date emp_dob;
	Date emp_doj;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(float empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public Date getEmp_dob() {
		return emp_dob;
	}
	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}
	public Date getEmp_doj() {
		return emp_doj;
	}
	public void setEmp_doj(Date emp_doj) {
		this.emp_doj = emp_doj;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}


}
