package com.example.hello;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	@Autowired
	private HelloRepository repository;
	
	//従業員１人分を取得
	public Employee getEmployee(String id) {
		//検索
		Map<String,Object> map = repository.findByID(id);
		
		//Mapから値を取得
		String employeeId = (String) map.get("id");
		String name = (String) map.get("name");
		int age = (Integer)map.get("age");
		
		//Employeeクラス（エンティティ）
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(name);
		employee.setEmployeeAge(age);
		
		return employee;
	}
}
