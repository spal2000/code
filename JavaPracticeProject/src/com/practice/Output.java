package com.practice;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Manager();

		System.out.println("The updated salary for Manager " + emp.updatedSalary(5000, 500));

		emp = new TeamLead();

		System.out.println("The updated salary for TeamLead " + emp.updatedSalary(7000, 500));

		emp = new Programmer();

		System.out.println("The updated salary for Programmer " + emp.updatedSalary(10000, 500));
	}

}
