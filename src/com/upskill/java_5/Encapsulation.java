package com.upskill.java_5;

public class Encapsulation {
	
	//Encapsulataion used to hide the data using setter and getter method 

private String name = "abc"; //write & read
private int ssn = 1234567890;  //write only
private String username = "Zoha"; //read only

//Setter Method - name
	public void setName(String value) {    //set the data
		name = value;
	}
	
	//Getter Method - name
		public String getName() {    //get the data
			return name;
		}
		//setter method
		public void setSSN(int value) {    //set the data
			ssn = value;	
		}
		//Getter Method - Username
				public String getUsername() {    //get the data
					return username;
				}
		
		public static void main(String[] args) {
   Encapsulation obj = new Encapsulation();
   obj.setName("abc");
   System.out.println(obj.getName());
   obj.setSSN(1234567890);
   obj.getUsername();
   System.out.println(obj.getUsername());
	}
		
				
						}
		


