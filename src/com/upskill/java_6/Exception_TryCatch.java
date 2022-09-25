package com.upskill.java_6;

public class Exception_TryCatch {

	public static void main(String[] args) {
		//Built-in Exceptions - ArrayIndexOutOfBoundsException
		try{
		 int[] ageChewbacca = new int[]{25, 26, 60, 45, 55, 35};
		 System.out.println("Student Age : " + ageChewbacca[6]);
		} catch (Exception e){
			System.out.println("Array Index not available");
			e.printStackTrace();
		}
			//Specific Built-in Exceptions - NumberFormatException
		try{
			 int num = Integer.parseInt("Test");
			 System.out.println("Value of num int : " + num);
			} catch (NumberFormatException e){
				System.out.println("Please enter a valid number");
				e.printStackTrace();
			}
		//User Define Exception
		try{
			throw new myException("Test");
		}catch (myException e){
			System.out.println("User Defined Exception");
			e.printStackTrace();
		}
		finally{
			System.out.println("Test Excution Completed");
		}
		}

	}


