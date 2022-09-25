package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	

	public static void main(String[] args) {
		
		// Array store multiple data using index
		
		int age = 30;
		int[] ageChewbacca = new int[]{24, 45, 29, 25, 33, 28};
		
		String[] nameChewbacca = new String[]{"Zoha", "Forhad", "Alex"};
		
		//Array Index
		
		System.out.println("Student Age : " + ageChewbacca[3]);
		System.out.println("Student Name : " + nameChewbacca[0]);
		
		//Array Index
		System.out.println("Student Name : " + nameChewbacca[1]);
		System.out.println("Total Student : " + nameChewbacca.length);
		
		//Multi-Dimentional Array
		
		int[][] ageChewbacca2D = {{24, 45, 29, 35, 33, 28},  //[0][0]  [0][1]  [0][2]  [0][3]  [0][4] [0][5]
				{24, 45, 29}};                               //[1][0]  [1][1]  [1][2]
		System.out.println("Student Age 2D: " + ageChewbacca2D[0][3]);
		
		//Hashmap store multiple data using key_value pair, Implementation of Map interface
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		Student.put("Zoha", 25);
		Student.put("Forhad", 30);
		Student.put("Promy", 17);
		Student.put("Alex", 29);
		System.out.println("Student Age " + Student.get("Promy"));
		
		HashMap<String, String> Country = new HashMap<String, String>();
		Country.put("Bangladesh", "Dhaka");
		Country.put("United States", "Washington DC");
		Country.put("India", "New Delhi");
		Country.put("Pakistan", "Islamabad");
		Country.put("United Kingdom", "London");
		System.out.println("Capital City: " + Country.get("Bangladesh"));
		
		
		//Hashset store unordered collection containing unique value, Implementation of set interface
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		System.out.println("Car : " + car);
		
		//Hashtable store multiple data using key-value pair, but is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "North America");
		System.out.println("Region : " + Region.get("USA"));
		
	}

}
