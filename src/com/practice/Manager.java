package com.practice;

public class Manager implements Employee  {

	@Override
	public double updatedSalary(double salary, double hike) {
		// TODO Auto-generated method stub
		salary = salary + (3*hike);
		return salary;
	}

}
