//Q1) Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
//strings is too long". Write a program that reads a String from user and calculates its length. and throws
//an exception of type ExceptionLineTooLong in the case where a string of length is more than 80
//characters
import java.util.Scanner;
class ExceptionLineTooLong extends RuntimeException{
	
	private String msg;
	
	public ExceptionLineTooLong(String msg){
		this.msg =msg;
	}
    
	public String getMessage() {
		return msg;
	}
	
}
class StringCalculator{
	private String string;
	
	private static Scanner sc = new Scanner(System.in);
	
	StringCalculator(){
		
	}
	
	public void acceptString() {
		
	     System.out.println("Enter The String");
	     string = sc.nextLine();
	     if(string.length()>80) {
	    	 throw new ExceptionLineTooLong("String is Too Long");
	     }
	     
	}
	
	public void printString() {
		System.out.println("Given String :"+ string);
	}
}
public class Problem1 {
      public static void main(String[] args) {
    	  StringCalculator strcal = new StringCalculator();
        try {
    	  strcal.acceptString();
        }catch(ExceptionLineTooLong ex) {
        	ex.getMessage();
        	ex.printStackTrace();
        }
          strcal.printString();
      }
}
