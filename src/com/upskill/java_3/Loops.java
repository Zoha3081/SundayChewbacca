package com.upskill.java_3;

public class Loops {



	public static void main(String[] args) {
		//practiceForloop();
		//practiceWhileloop();
		//practiceDoWhileloop();
		//practiceinfiniteloop();
		practiceNastedloop();
	}
	
	public static void practiceForloop(){
		
		int i;
		for (i = 1; i <= 10; i++){
			System.out.println("For Loops Number = " + i);
		

	}

}
	public static void practiceWhileloop(){
		int i = 1;
		while(i<=10){
			System.out.println("while Loops Number = " + i);	
			i++;
		}
	}
	
	public static void practiceDoWhileloop(){
		int i = 1;
		do{
			System.out.println("Do while Loops Number = " + i);
			i++;
		} while (i<=10);
	}
	public static void practiceinfiniteloop(){
		int i;
		for (i = 1; ; i++){
			System.out.println("Infinite Loops Number = " + i);
	}
	
}
	public static void practiceNastedloop(){	
		int i;
		int j;
		for(i = 1; i <= 10; i++){
		for(j = 1; j <= 10; j++){
			int multipicationTable = i * j;
			System.out.print(multipicationTable +  " ");
		}
		System.out.println(" ");
		}
	}
	
}