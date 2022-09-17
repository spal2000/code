package com.practice.model;

public class StudentModel {
	private int rollNo;
	private String name;
	private int avgMarks;
	
	
	public StudentModel() {
		super();
	}
	public StudentModel(int rollNo, String name, int avgMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.avgMarks = avgMarks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAvgMarks() {
		return avgMarks;
	}
	public void setAvgMarks(int avgMarks) {
		this.avgMarks = avgMarks;
	}

}
