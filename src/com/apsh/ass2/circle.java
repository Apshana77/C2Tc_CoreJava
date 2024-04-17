package com.apsh.ass2;
import java.util.Scanner;
public class circle {
                 
	            // TODO Auto-generated method stub
		        double radius;
		        String color;
		        Scanner scanner = new Scanner(System.in);
		        public void getinput() {
		                System.out.println("Enter Radius: ");
		                radius = scanner.nextDouble();
		                System.out.println("Enter Colour: ");
		                color = scanner.next();}
                public void calcArea(){
		                double area = 3.14d* radius * radius;
		                System.out.println("Area of the Circle: " + area);
		                }
		        public static void main(String[] args) {
		                circle c= new circle ();
		                c.getinput();
		                c.calcArea();
		        }
}
