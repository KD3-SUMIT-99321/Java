package com.app.geometry;


//1) Create a class Point2D , in package - "com.app.geometry" : for representing
//a point in x-y co-ordinate system. Create a parameterized constructor to init
//x & y co-ords. Add a method to return string form of point's x & y co-ords
//Hint : public String getDetails())
//Add isEqual method to Point2D class :a boolean returning method : must
//return true if n only if both points are having same x,y co-ords or false
//otherwise.
//Add calculateDistance method to calculate distance between current point
//and specified point & return the distance to the caller.
//Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow
//etc.
//Write TestPoint class , in package "tester" , with a main method, Accept co
//ordinates of 2 points from user (Scanner) --to create 2 points (p1 & p2)
//Use getDetails method to display point details.(p1's details & p2's details)
//Invoke isEqual & display if points are same or different (i.e p1 & p2 are located
//at the same position)
//If they are not located at the same position , display distance between p1 &
//p2
import java.util.Scanner;

public class Point2D {
	
    private double x;
    private double y;
    
    public Point2D(){
    	
    }
    
   public Point2D(double x,double y){
    	this.x=x;
    	this.y=y;
    }
    
    public static boolean isEqual(Point2D p1,Point2D p2){
    	if(p1.x==p2.x  && p1.y==p2.y){
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public double calculateDistance(Point2D p1,Point2D p2){
    	
    	double xdiff = p2.x - p1.x;
    	double ydiff = p2.y - p1.y;
    	
    	double distance = Math.sqrt(Math.pow(xdiff,2)+ Math.pow(ydiff,2));
    	
    	return distance;
    }
    
    public String getDetails() {
    	return "Point2D: x :"+x +" "+ "y:" +y;
    }
    
    

}
