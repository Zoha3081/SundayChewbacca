package com.upskill.java_1;

public class AccessModifier {

	
	public String name = "ZoHa"; 
	private int age =25;
	protected int ssn = 1234567890;
	String city = "New York";


	public static void main(String[] args){
		
		AccessModifier myobj = new AccessModifier();
		System.out.println("age" + myobj . age);				
	}
  
		


}
