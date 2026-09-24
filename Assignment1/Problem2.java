//
//2. Accept 2 double values from User (using Scanner). Check data type. If
//arguments are not doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.

import java.util.Scanner;

class CheckValue{
	private double num1;
	private double num2;
	
	
	public void acceptValues() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number 1.");
		
		
		 if(!sc.hasNextDouble()) {
			 
			 System.out.println("Error : Number 1 is Not Double");
			  return ;
		 }
		   num1 =sc.nextDouble();	
		    sc.nextLine();
		
		System.out.println("Enter The Number 2.");
		
		if(!sc.hasNextDouble()) {
			
			System.out.println("Error : Number 2 is Not Double");
			return ;
        }
        	num2 =sc.nextDouble();	
       
		
		calculateAverage(num1,num2);
	}
	
	public void calculateAverage(double n1,double n2) {
		double avg = (n1+n2)/2;
	
		System.out.println("Average Of Given Two Numbers is :" + avg);
		
	}
	
}


public class Problem2 {
     public static void main(String[] args) {
    	
    	 CheckValue cv = new CheckValue();
    	 cv.acceptValues();
     }
}
