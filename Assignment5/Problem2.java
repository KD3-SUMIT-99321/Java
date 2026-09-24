//Q2) Write a java code to check string is palindrome.

import java.util.Scanner;
class Palindrome{
	
	public static boolean isPalindrome(String s) {
	    int i=0;
	    int j=s.length()-1;
	    String str = s.toLowerCase();
	    while(i<j) {
	    	if(str.charAt(i)!=str.charAt(j)) {
	    		return false;
	    	}
	    	i++;
	    	j--;
	    }
	    
	    return true;
	}
}
public class Problem2 {
   public static void main(String [] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the String");
	   String str = sc.nextLine();
	   
	   if(Palindrome.isPalindrome(str)) {
		    System.out.println(str +" "+ "IS PALINDROME");
		    
	   }else {
		   System.out.println(str +" "+ "IS NOT PALINDROME");
	   }
   }
}
