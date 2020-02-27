package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	public void serviceOffered(Employee e);
	public void addData(Employee e);
	List<Employee> printDetails();
}