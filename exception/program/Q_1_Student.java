package com.yash.exception.program;

public class Q_1_Student {
	int rollno;
	String sname;
	String saddress;
	Q_1_StudentResult srobj;
	
	public Q_1_Student(int rollno, String sname, String saddress, Q_1_StudentResult srobj) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.saddress = saddress;
		this.srobj = srobj;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", saddress=" + saddress + ", srobj=" + srobj + "]";
	}

}

