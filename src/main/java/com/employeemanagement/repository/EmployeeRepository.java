package com.employeemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemanagement.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	List<Employee> findByFirstName(String firstName);
	
	List<Employee> findByLastName(String lastName);
	
	Employee findByPhone(Long phone);
	
	Employee findByEmail(String email);
	
	List<Employee> findByActive(boolean active );
	
	
//	@Modifying
//	@Query("update Employee e set e.firstName = ?1, e.lastName = ?2, e.dateOfBirth= ?3, e.email=?4, e.phone=?5,e.photoPath=?6, where e.empId = ?7")
	//void setEmployeeInfoById(String firstName, String lastName, Date dateOfBirth,String email,Long phone, String photoPath, Long empId  );
}
