package com.upskill.java_4;

import com.upskill.java_2.MethodType;

public class Polymorphism extends MethodType {

	

	public static void main(String[] args) {
		car();
		car(4);
		car(2,4);
		car("Red");
		
		weeklyIncomeStatic();
	}
	//method overriding - runtime Polymorphism - Dynamic binding
		//Same method name from parent class to override
	public static void weeklyIncomeStatic(){
		int weeklyIncome = hourlyIncome * 40 + 1000;
		System.out.println("My Weekly Income = " + weeklyIncome);
	}
	
	
	
	//method overloading - compile time Polymorphism - static binding
	//Same method name with different signature
	
	public static void car(){
		System.out.println("My car is Audi ! ");
	}
	public static void car(int door){
		System.out.println("My car is Audi, it has door : " + door);
	}
	public static void car(int door, int wheel){
		System.out.println("My car is Audi, it has door : " + door + "it has wheel : " + wheel);
	}
	
	public static void car(String color){
		System.out.println("My car is Audi, it has door : " + color);
	}

	}


