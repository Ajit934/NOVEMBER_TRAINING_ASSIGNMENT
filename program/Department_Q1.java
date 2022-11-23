package com.yash.oops.program;

public class Department_Q1 {
	 @Override
	public String toString() {
		return "Department_Q1 [deptid=" + deptid + ", dname=" + dname + "]";
	}
	private int  deptid;
	 private String  dname;
	 public Department_Q1(int deptid, String dname) {
		super();
		this.deptid = deptid;
		this.dname = dname;
	}
	public Department_Q1() {
		
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}

}
