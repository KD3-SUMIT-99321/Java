package com.app.Tester;

import java.util.Scanner;

import com.app.geometry.Point2D;


public class Tester {
	 private Point2D p1;
	 private Point2D p2;  
	 private Point2D caller= new Point2D();
	 
	public void getDetails() {
		
		 
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Point 1 Co-Ordinates x & y");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		this.p1=new Point2D(x1,y1);
		
		System.out.println("Enter the Point 2 Co-Ordinates x & y");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		this.p2=new Point2D(x2,y2);  
	}
	
	public void checkIsEqual(){
		if(caller.isEqual(p1, p2)) {
			System.out.println("Both Are On Same Location");	
		}else {
			System.out.println("DISTANCE BETWEEN TWO POINT IS:"+ caller.calculateDistance(p1, p2));
		}
		
	}
	
	public void getPoints() {
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
	}
	
	public static void main(String[]args) {
		Tester test = new Tester();
        test.getDetails();
        test.checkIsEqual();
        test.getPoints();
	}
}
