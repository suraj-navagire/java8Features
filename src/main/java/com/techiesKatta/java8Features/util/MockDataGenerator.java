package com.techiesKatta.java8Features.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.techiesKatta.java8Features.data.ContactDetail;
import com.techiesKatta.java8Features.data.Employee;
import com.techiesKatta.java8Features.data.Gender;

public class MockDataGenerator {

	/**
	 * Used to return list of employees. 
	 * 
	 * @param numberOfEmployee
	 * @return
	 */
	public static List<Employee> getListOfEmployees(int numberOfEmployee) {
		List<Employee> result = new ArrayList<>();
		
		Random random = new Random();
		
		Employee employee = null;
		
		int id = 1;
		
		for(int i=0; i<numberOfEmployee;i++) {
			
			employee = new Employee(id, "ABC"+id, "XYZ"+id);
			employee.setAge(22 + random.nextInt(36));
			
			int genderRandom = random.nextInt(2);
			employee.setGender(genderRandom == 1 ? Gender.FEMALE : Gender.MALE);
			ContactDetail detail = new ContactDetail();
			detail.setEmailId("email"+id+"@o.com");
			
			employee.setContactDetail(detail);
			
			result.add(employee);
			id++;
		}
		
		return result;
	}
}
