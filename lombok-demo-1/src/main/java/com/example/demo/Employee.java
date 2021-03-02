package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
	@NonNull
	private String employeeId;
	private String firstName;
	private String lastName;
	private String email;
	//private final String gender;

}
