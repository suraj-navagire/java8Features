package com.techiesKatta.java8Features.data;

import lombok.Data;
import lombok.NonNull;

@Data
public class Employee {

	@NonNull
	private Integer id;

	@NonNull
	private String firstName;

	@NonNull
	private String lastName;

	private String middleName;

	private int age;

	private Gender gender;

	private ContactDetail contactDetail;
}
