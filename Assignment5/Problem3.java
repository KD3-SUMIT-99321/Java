//Q3) write a java program to count number of words in a String.
//Hint: You can use , trim() , length() and split() methods

import java.util.Scanner;
class StringCounter{
	
	public static int counter(String s) {
		
		String []str = s.trim().split(" ");
		
	      return str.length;
	}
}
public class Problem3 {
   public static void main(String[] args) {
	   System.out.println("Enter The String");
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	  
	   System.out.println("Count :" + StringCounter.counter(s));
   }
}
