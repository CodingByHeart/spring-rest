package com.coding.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.coding.bean.EmployeeBean;

@Repository
public class EmployeeDao {
	
	public  List<EmployeeBean>getEmployeeData(){
		List<EmployeeBean>empList=new ArrayList<EmployeeBean>();
		empList.add(new EmployeeBean(101, "sham","80976","hyd"));
		empList.add(new EmployeeBean(102, "ram","70976","pune"));
		empList.add(new EmployeeBean(103, "john","50976","usa"));
		empList.add(new EmployeeBean(104, "sina","60976","canada"));
		empList.add(new EmployeeBean(105, "suresh","30976","pune"));
		empList.add(new EmployeeBean(106, "ramesh","20976","chennai"));
		return empList;
		
	}

}
