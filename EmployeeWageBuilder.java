package com.employeewage.problems;

import java.util.Random;

public class EmployeeWageBuilder  {

	public static void main(String[] args) {
		System.out.println("*******WELCOME TO EMPLOYEEWAGE COMPUTATION PROBLEM*******");
		//constants
		final int ISPRESENT=1;
		final int ISPARTTIME=2;
		final int EmpRatePerHour=20;
		int empHrs;
		final int TOTAL_EMP_HRS=100;
		final int TOTAL_WORKING_DAYS=20;
		int workingDays=0;
		int totalworkinghours=0;
		
		
		//random class
		Random random=new Random();
		while(totalworkinghours<=TOTAL_EMP_HRS && workingDays<TOTAL_WORKING_DAYS) {
			
		//generating Random variable
		int empCheck=random.nextInt(3);
		//case statement
		switch(empCheck) {
		case ISPRESENT: 
			empHrs=8;
	        break;	
		case ISPARTTIME: 
			empHrs=4;
		    break;
		default:
            empHrs=0;
		}
		workingDays++;
		totalworkinghours+=empHrs;
		
		
	}
	   System.out.println("TOTALWORKINGHOURS : "+totalworkinghours);	
	   System.out.println("workingDays : "+workingDays);
		System.out.println("Employeewage = "+totalworkinghours*EmpRatePerHour);
	}
}