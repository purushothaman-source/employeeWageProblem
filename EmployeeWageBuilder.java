package com.employeewage.problems;

import java.util.Random;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		System.out.println("*******WELCOME TO EMPLOYEEWAGE COMPUTATION PROBLEM*******");
		//constants
		final int ISPRESENT=1;
		final int ISPARTTIME=2;
		final int EmpRatePerHour=20;
		int empHrs;
		//random class
		Random random=new Random();
		//generating Random variable
		int empCheck=random.nextInt(3);
		if(empCheck==ISPRESENT) {
			System.out.println("EMPLOYEE IS PRESENT FULLTIME");
			empHrs=8;
		}
		else if (empCheck==ISPARTTIME) {
			System.out.println("EMPLOYEE IS PART TIME");
			empHrs=4;
		}
		else {
			System.out.println("EMPLOYEE IS ABSENT");
            empHrs=0;
		}
		System.out.println("Employeewage = "+empHrs*EmpRatePerHour);
	}
}
