package com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.cg.eis.bean.Employee;
import com.cg.util.DBUtil;

public class EmployeeServiceImpl implements EmployeeService{
	@Override
	public void serviceOffered(Employee e) {
		if(e.getSal()>5000 && e.getSal()<20000) {
			e.setInsuranceScheme("Scheme C");
		}
		else if(e.getSal()>=20000 && e.getSal()<40000) {
			e.setInsuranceScheme("Scheme B");
		}
		else if(e.getSal()>=40000) {
			e.setInsuranceScheme("Scheme A");
		}
		else
			e.setInsuranceScheme("No Scheme");
	}
	
	@Override
	public void addData(Employee e) {
		DBUtil.hm.put((int) Math.round(Math.random()*100),e);
	}

	@Override
	public List<Employee> printDetails() {
		List<Employee> li = new ArrayList<Employee>();
		Employee e = null;
		for(Map.Entry<Integer, Employee> me: DBUtil.hm.entrySet()) {
			e = me.getValue();
			li.add(e);
		}
		return li;
	}
}