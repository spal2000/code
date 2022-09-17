package com.practice;

public class TeamLead implements Employee{

	@Override
	public double updatedSalary(double salary,double hike) {
		
		// TODO Auto-generated method stub
	    salary = salary + (2*hike);
		return salary;
	}

}
