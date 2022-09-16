package com.practice;

public class Programmer implements Employee {

	@Override
	public double updatedSalary(double salary, double hike) {
		// TODO Auto-generated method stub
		salary = salary + hike;
		return salary;
	}


}
