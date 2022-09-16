package com.practice;

class S{
	private int rollno;
	private String name;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}



public class Encapsulation {
	
	public static void main(String[] args) {
		
		S s1 = new S();
		s1.setRollno(2);
		s1.setName("sougata");
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
       
	}

}
