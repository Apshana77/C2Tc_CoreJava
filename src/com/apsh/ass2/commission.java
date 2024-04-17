package com.apsh.ass2;
import java.util.Scanner;
public class commission {
   String name;
   String address;
   String phone;
   double salesAmount;
   double commission;
   Scanner read = new Scanner(System.in);

   // Method to accept details of the sales employee
   public void acceptDetails() {
      
       
       System.out.println("Enter Name: ");
       name = read.nextLine();
       
       System.out.println("Enter Address: ");
       address = read.nextLine();
       
       System.out.println("Enter Phone: ");
       phone = read.nextLine();
       
       System.out.println("Enter Sales Amount: ");
       salesAmount = read.nextDouble();
   }

   // Method to calculate commission
   void calculateCommission() {
       if (salesAmount >= 100000) {
           commission = salesAmount * 0.10;
       } else if (salesAmount >= 50000 && salesAmount < 100000) {
           commission = salesAmount * 0.05;
       } else if (salesAmount >= 30000 && salesAmount < 50000) {
           commission = salesAmount * 0.03;
       } else {
           commission = 0;
       }
       System.out.println("Commission: " + commission);
   }



   public static void main(String[] args) {
       commission commission = new commission();
       commission.acceptDetails();
       commission.calculateCommission();
   }
}


