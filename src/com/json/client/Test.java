package com.json.client;

import com.json.bean.Employee;
import com.json.util.JsonUtil;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpNo(100);
		emp.setName("Sudhir");
		emp.setSalary(10000.00);
		String jsonEmployee = JsonUtil.convertJavaObjToJson(emp);
		System.out.println(jsonEmployee);
		System.out.println("=====================================");
		
		  Employee emp1 = JsonUtil.convertJsonToJavaObj(jsonEmployee, Employee.class);
		  System.out.println(emp1.getEmpNo() + " " + emp1.getName() + " " +
		  emp1.getSalary());
		 
	}

}

// Test git1
