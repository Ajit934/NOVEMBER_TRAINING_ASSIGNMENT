package com.mgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mgmt.entity.EmployeeEntity;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {

//	@Query("Select * from employee_management e where e.emp_id = :id ")
//	EmployeeEntity getEmployeeEntityById(Integer id);
}
