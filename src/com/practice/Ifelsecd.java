package com.practice;

public class Ifelsecd {

	public static void main(String[] args) {
		//using advanced for loop with array
		String[] names = {"sougata","gourab","soumyadeep","soumen","subrata"};
//		for(int i = 0;i<=names.length;i++){
//			 if(names[i].startsWith("a") 
//		||names[i].startsWith("e")||
//		names[i].startsWith("i")||
//		names[i].startsWith("o")||
//		names[i].startsWith("u") ) 
//		 {
		for(String name:names){
			 if(name.toLowerCase().startsWith("s") ||
					 name.toLowerCase().startsWith("e")||
					 name.toLowerCase().startsWith("i")||
					 name.toLowerCase().startsWith("o")||
					 name.toLowerCase().startsWith("u") ) {
		
				System.out.println(name); 
			 }
			 else
			 {
				 System.out.println("Name is Invalid");
			 }
	
				 		
}
}}