package com.classroom.program;

import java.util.Scanner;

public class Review {
	
   String removeWhiteSpace(String enter2) {

		System.out.println("Entered String : " + enter2 );
	     
	     enter2 = enter2.replaceAll("\\s","");
	     System.out.println("Final Output of String : " +enter2);
		return enter2;
   }
	
	public static void main(String[] args) {
		Review obj = new Review();
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the String");
	     String enter = sc.nextLine();

     String enter2 = obj.removeWhiteSpace(enter);
	}
}
