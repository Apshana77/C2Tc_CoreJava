package com.apsh.ass2;
import java.util.Scanner;
public class studentdetails {
	            public static void main(String[]args) 
	           {
		                  Scanner s =new Scanner(System.in);
		              System.out.println("Enter your full name:");
		              String fullName=s.nextLine();
		              System.out.println("Enter your rollNumber:");
		              String rollNumber=s.nextLine();
		              System.out.println("Enter your grade:");
		              char grade=s.next().charAt(0);
		              System.out.println("Enter your percentage:");
		              double percentage=s.nextDouble();
		              System.out.println("\nyour Details:");
		              System.out.println("Full Name:"+fullName);
		              System.out.println("Roll Number:"+rollNumber);
		              System.out.println("grade:"+grade);
		              System.out.println("percentage:"+percentage);
		
		
		
	}

}
