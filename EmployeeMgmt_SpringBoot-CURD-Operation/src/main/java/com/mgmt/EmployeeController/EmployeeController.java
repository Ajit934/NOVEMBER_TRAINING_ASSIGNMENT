package com.mgmt.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgmt.EmloyeeService.EmployeeServiceImp;
import com.mgmt.entity.EmployeeEntity;

@RestController
public class EmployeeController {
@Autowired
	private EmployeeServiceImp service; 

@GetMapping("/employee")
public List<EmployeeEntity> getEmployeesList(){
	return this.service.getAllEMployees();
}

@PostMapping("/employee")
public EmployeeEntity saveEmployeeEntity(@RequestBody EmployeeEntity emp) {
	return this.service.saveEmployee(emp);
}
@PutMapping("/employee")
public String editEmployee(@RequestBody EmployeeEntity emp) {
	String s = "successfully updated";
	EmployeeEntity e = this.service.editEmployee(emp);
	if(e==null) {
		return "unable to find the employee with ID:"+emp.getEmp_id();
	}
	return s;
}
@DeleteMapping("/employee/{id}")
public String deleteEmployee(@PathVariable("id") Integer eid) {
	return this.service.deletEmployee(eid);
}
@GetMapping("/employee/{id}")
public EmployeeEntity getEmpById(@PathVariable("id") Integer eid) {
	return this.service.getById(eid);
	
}
	
	
}
