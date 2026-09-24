//Q1) Write a java program to reverse a String


class ReverseString{
	public static String reverseString(String s) {
		
		int i=0;
		int j=s.length()-1;
		char []str = s.toCharArray();
		
		while(i<j) {
			
			char temp =str[i];
			     str[i] =str[j];
			     str[j]=temp;
			i++;
			j--;
			
			
		}
			
		return String.valueOf(str);
	}
}
public class Problem1 {
  public static void main(String[] args) {
	  System.out.println(ReverseString.reverseString("Siddhesh"));
  }
}
