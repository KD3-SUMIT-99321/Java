//Q2) Build a new Circle class with the following basic features:
// Attributes:
//o Center point - Build instance variables for the circle’s center point
//(myX and myY represented as double values).
//o Diameter - Build an instance variable for the circle’s diameter (myDiameter also
//represented as a double value).
// Behaviors
//o Default constructor - Build a default constructor that initializes the circle’s center
//point to (0, 0) and its diameter to 100.
//o Accessor methods - Build accessor methods for the two center coordinates and the
//diameter.
// Invariant
//o The circle’s diameter should always be non-negative. maintain the integrity of each
//circle object by ensuring that the class invariant (that the diameter should be nonnegative) is true at all times.
//If the diameter is negative then throw user defined exception.

import java.util.Scanner;
class InvalidInputException extends Exception{
	
	
	public InvalidInputException(String msg) {
		super(msg);
	}
}
class Circle{
	private double myX;
	private double myY;
	private double diameter;
	
	
	Circle(){
		this.myX=0;
		this.myY=0;
		this.diameter=100;
	}
	
	public void acceptRecord() throws InvalidInputException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Point X");
		this.myX=sc.nextDouble();
		
		System.out.println("Enter The Point Y");
		this.myY=sc.nextDouble();
		
		
		System.out.println("Enter The Diameter");
		double v3=sc.nextDouble();
		if(v3<0) {
			throw new InvalidInputException("Value Can't be Negative");
		}else {
			this.diameter=v3;
		}
		
	
		
	}
	
	public double getX(){
		return this.myX;
	}
	public double getY(){
		return this.myX;
	}
	public double getDiameter(){
		return this.diameter;
	}
	
	public void printRecord() {
		System.out.println("X : " +getX());
		System.out.println("Y : " +getY());
		System.out.println("Diameter : " +getDiameter());
	}
	
}
public class Problem2 {
     public static void main(String[] args) {
    	 Circle c = new Circle();
         try {
         c.acceptRecord();
         }catch(InvalidInputException ex) {
        	 ex.getMessage();
         } 
         c.printRecord();
     }
     
     
     
}
