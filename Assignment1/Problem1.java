
import java.util.Scanner;

class Convertor{
	
     private int num;
     
     
     
     public void acceptNum() {
    
    	 Scanner sc = new Scanner(System.in);	 
         System.out.println("Enter The Number");   
         this.num= sc.nextInt();
     
     }
     
     
    public void printRecord() {
    	
    	System.out.println("Given Number :"+ num);
    	System.out.println();
    	System.out.printf("Binary equivalent : "+Integer.toBinaryString(num));
    	System.out.println();
    	System.out.printf("Hexadecimal equivalent : "+Integer.toHexString(num));
    	System.out.println();
    	System.out.printf("Octal equivalent : "+Integer.toOctalString(num));
    	
    	
    }
     
}
public class Problem1 {
    public static void main(String[] args) {
    	Convertor c = new Convertor();
    	c.acceptNum();
    	c.printRecord();
    }
}
