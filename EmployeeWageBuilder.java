package com.employeewage.problems;

import java.util.Random;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		System.out.println("*******WELCOME TO EMPLOYEEWAGE COMPUTATION PROBLEM*******");
		//constants
		final int ISPRESENT=1;
		//random class
		Random random=new Random();
		//generating Random variable
		int empCheck=random.nextInt(2);
		if(empCheck==ISPRESENT)
			System.out.println("EMPLOYEE IS PRESENT");
		else 
			System.out.println("EMPLOYEE IS ABSENT");
 }
}
