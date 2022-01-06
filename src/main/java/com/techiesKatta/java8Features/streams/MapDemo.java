package com.techiesKatta.java8Features.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.techiesKatta.java8Features.data.Employee;
import com.techiesKatta.java8Features.util.MockDataGenerator;

public class MapDemo {
	
	public static void main(String[] args) {
		MapDemo demo = new MapDemo();
		demo.startApp();
	}
	
	private void startApp() {
		List<Employee> employees  = MockDataGenerator.getListOfEmployees(50);
		System.out.println("All employees count : " + employees.size());
		System.out.println("All employees : ");
		employees.stream().forEach(System.out::println);
		
		printIdOfAllEmployee(employees);
	}
	
	private void printIdOfAllEmployee(List<Employee> employees) {
		List<Integer> ids = employees.stream().map(e -> e.getId()).collect(Collectors.toList());
		System.out.println();
		System.out.println("All Employee Ids : ");
		ids.stream().forEach(System.out::println);
	}
}
