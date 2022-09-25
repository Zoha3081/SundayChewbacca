package com.upskill.assignment_1;

public class PerimeterOfRectangle {
	
	 static int perimeterRectangle(int a, int b)
	    {
	       int perimeter = 2*(a + b);
	       return perimeter;
	    }
	 
	 public static void main (String[] args) {
		 
	        int a = 9;
	        int b = 13;
	        System.out.println("Perimeter = "+ perimeterRectangle(a, b));
	 
	    }
	}
