package com.bank;

import java.util.Scanner;

public class Calculator {
	private int accountNumber ;
    
    private int beginningBalance ;

    private int charges;
    
    private int credits;
  
    private int creditLimit;
    
    
    public void acceptRecord() {
  	  Scanner sc = new Scanner(System.in);
  	  System.out.print("Enter account number: ");
  	      this.accountNumber = sc.nextInt();

  	     System.out.print("Enter beginning balance: ");
  	     this. beginningBalance = sc.nextInt();

  	     System.out.print("Enter total charges this month: ");
  	     this.charges = sc.nextInt();

  	     System.out.print("Enter total credits this month: ");
  	     this. credits = sc.nextInt();

  	     System.out.print("Enter credit limit: ");
  	     this. creditLimit = sc.nextInt();
    }
    
    
    public void getNewBalance() {
  	  int newBalance = beginningBalance + charges - credits;
  	     System.out.println("\nAccount Number: " + this.accountNumber);
  	     System.out.println("New Balance:" + newBalance);
  	  
  	     if (newBalance > creditLimit) {
           System.out.println("Credit limit exceeded");
       }
      }
    
    
    public static void main(String[]args) {
    	 Calculator c = new Calculator();
    	 c.acceptRecord();
    	 c.getNewBalance();
    	 
    }
    
      
      
}
