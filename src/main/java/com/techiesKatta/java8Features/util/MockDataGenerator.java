package com.techiesKatta.java8Features.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.techiesKatta.java8Features.data.Employee;

public class MockDataGenerator {

	public List<Employee> getListOfEmployees(int numberOfEmployee) {
		List<Employee> result = new ArrayList<>();
		
		Random age = new Random();
		
		Employee employee = null;
		
		for(int i=0; i<numberOfEmployee;i++) {
			employee = new Employee();
		}
		
		return result;
	}
}
