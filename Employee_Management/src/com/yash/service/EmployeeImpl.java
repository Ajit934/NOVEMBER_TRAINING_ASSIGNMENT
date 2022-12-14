package com.yash.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxExpr.Identifier;
import com.yash.connection.Employee_Connection;
import com.yash.model.Employee;

public class EmployeeImpl implements IEmployee {
	Employee_Connection emp_con = new Employee_Connection();
	Scanner sc= new Scanner(System.in);

	@Override
	public void save_Emp(Employee e) {
		String s = "insert into employee values(?,?,?,?,?)";
		int count=0;
		try {
			PreparedStatement ps = emp_con.getCon().prepareStatement(s);
			ps.setInt(1, e.getEmp_id());
			ps.setString(2, e.getEmp_name());
			ps.setString(3, e.getEmp_add());
			ps.setInt(4, e.getSal());
			ps.setString(5, e.getEmp_design());
			 count=ps.executeUpdate();
			 if(!(count==0)) {
				 
				 System.out.println("***==> Employee saved sucess <==***");
			 }
			 else
				 System.out.println("Employee not saved ");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

	@Override
	public String edit_Emp(int eid) {
		System.out.println("Enter new Designation");
		String str= sc.next();
		
		String query="update  employee set emp_designation='"+str+"' where  emp_id='"+eid+"'";
		String result="";
		int count =0;
		try {
			PreparedStatement ps= emp_con.getCon().prepareStatement(query);
			
			
			count =ps.executeUpdate();
			if(count!=0)
				result=" Employee Sucessfully updated";
			else
				result="not updated";
			
			
		}
		catch (SQLException sql) {
			
			sql.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Employee> view_Emp() {
		String query="Select * from employee";
		try {
			Statement st= emp_con.getCon().createStatement();
			ResultSet rs=st.executeQuery(query);
			System.out.println("-------------------Employee List---------------------");
			while (rs.next()) {
			System.out.println( rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
				
			}
		}
		catch (SQLException sql) {
			sql.printStackTrace();
			
		}
		
		
		return null;
	}

	@Override
	public void getOne_Emp(int id) {
		String query="select * from employee where emp_id=' "+id+"'";
		try {
			Statement st= emp_con.getCon().createStatement();
			ResultSet rs=st.executeQuery(query);
			System.out.println("-------------------Employee Details---------------------");
			while (rs.next()) {
			System.out.println( rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
				
			}
		}
		catch (SQLException sql) {
			sql.printStackTrace();
			
		}
		
		
	}

	@Override
	public String delet_Emp(int id) {
		String query="delete  from employee  where emp_id='"+id+"'";
		String result=null;
		int count =0;
		try {
			PreparedStatement ps= emp_con.getCon().prepareStatement(query);
			count =ps.executeUpdate();
			if(count!=0)
				result="Sucessfully deleted";
			else
				result="Not deleted";
			
			
		}
		catch (SQLException        ese) {
			
			ese.printStackTrace();
		}
		
	
		return result;
	}

}
