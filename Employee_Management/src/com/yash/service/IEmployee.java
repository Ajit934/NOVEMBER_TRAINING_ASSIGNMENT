package com.yash.service;

import java.util.List;

import com.yash.model.Employee;

public interface IEmployee {
	//Save employee
	public void save_Emp(Employee e);
//Edit employee
	String edit_Emp(int eid);
//View all employee
	List<Employee> view_Emp();
//View one employee
	void getOne_Emp(int id);
//Delete employee
	String delet_Emp(int id);

}
