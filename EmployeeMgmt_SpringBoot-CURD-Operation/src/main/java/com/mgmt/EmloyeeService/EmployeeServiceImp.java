package com.mgmt.EmloyeeService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmt.entity.EmployeeEntity;
import com.mgmt.repo.EmployeeRepo;

@Service
public class EmployeeServiceImp {
	@Autowired
	private EmployeeRepo repo;
	
	public List<EmployeeEntity> getAllEMployees(){
		return this.repo.findAll();
	}
	
	public EmployeeEntity saveEmployee(EmployeeEntity emp) {
		return this.repo.save(emp);
	}
	public EmployeeEntity editEmployee(EmployeeEntity emp) {
		int i=emp.getEmp_id();
		EmployeeEntity e=this.repo.findById(i).orElseThrow(()->new RuntimeException("Employee not found with id"));
		if(e!=null) {
			return this.repo.save(emp);
			
		}
		return null;
			
	}
	public String deletEmployee(int id) {
		String s ="successfully deleted";
		try {
		EmployeeEntity e=this.repo.findById(id).orElseThrow(()->new RuntimeException("Employee not found with id"));
			this.repo.deleteById(id);
			return s;
		}catch(RuntimeException e) {
			s="unable to delete";
		}
		return s;
				
	}
	 public EmployeeEntity getById(Integer eid) {
		 EmployeeEntity e=this.repo.findById(eid).orElseThrow(()->new RuntimeException("Employee not found with id"));
		return e;
	}

}
