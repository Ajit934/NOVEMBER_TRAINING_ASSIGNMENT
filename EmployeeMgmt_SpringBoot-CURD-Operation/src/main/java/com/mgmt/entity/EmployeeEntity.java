package com.mgmt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="EmployeeManagement")
public class EmployeeEntity {
	@Id
	private int Emp_id;
	
	private String emp_name;
	private String emp_add;
	private int sal;
	private String emp_design;
	
	public EmployeeEntity() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeEntity(int emp_id, String emp_name, String emp_add, int sal, String emp_design) {
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

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_add() {
		return emp_add;
	}

	public void setEmp_add(String emp_add) {
		this.emp_add = emp_add;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getEmp_design() {
		return emp_design;
	}

	public void setEmp_design(String emp_design) {
		this.emp_design = emp_design;
	}
	
	
	
	

}
