
//Display food menu to user. User will select items from menu along with the
//quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed
//prices to food items(hard code the prices) When user enters 'Generate Bill'
//option , display total bill & exit.

import java.util.Scanner;
class Food{
	 
	double dosa =70.00;
	double samosa=25.00;
	double idli = 50.30;
	double PavBhaji=100.00;
	double Kachori =30.00;
	double Bhel=40.00;
	double PavVada=10.00;
	double Misal=100.00;
	double Noodels=80.00;
	double Soya=50.00;
	
	
	int  quantity;
	int totalBill;
	
	
    public void getQuntity(int quantity ,int item) {
    	this.quantity=quantity;
    	if(item==1) {
    		totalBill+=dosa*quantity;
    	}else if(item==2) {
    		totalBill+=samosa*quantity;
    	}else if (item==3){
    		totalBill+=idli*quantity;
    	}
    	else if (item==4){
    		totalBill+=PavBhaji*quantity;
    	}
    	else if (item==5){
    		totalBill+=Kachori*quantity;
    	}
    	else if (item==6){
    		totalBill+=Bhel*quantity;
    	}
    	else if (item==7){
    		totalBill+=PavVada*quantity;
    	}
    	else if (item==8){
    		totalBill+=Misal*quantity;
    	}
    	else if (item==9){
    		totalBill+=Noodels*quantity;
    	}
    	else if (item==10){
    		totalBill+=Soya*quantity;
    	}
    }
    
    public void generateBill() {
    	System.out.println("Total Bill :"+ totalBill);
    }
    
   
    
	
}
class Menu{
	
	public int getMenu(){
		int choice ;
		
		System.out.println("1.Dosa");
		System.out.println("2.Samosa");
		System.out.println("3.idli");
		System.out.println("4.Pav Bhaji");
		System.out.println("5.Kachori");
		System.out.println("6.Bhel");
		System.out.println("7.Pav Vada");
		System.out.println("8.Misal");
		System.out.println("9.Noodels");
		System.out.println("10.Soya");
		System.out.println("11.Generate Bill");
		System.out.println("0.Exit");
		
		System.out.println("Enter The Choice :");
		Scanner sc = new Scanner(System.in);
		choice =sc.nextInt();
		
		return choice;
		
	}
	
	


public class Problem3 {
     public static void main(String[]args) {
    	 int choice;
    	 Menu m = new Menu();
    	 Food f = new Food();
    	 Scanner sc = new Scanner(System.in);
    	 
    	 while((choice=m.getMenu())!=0) {
    		 
    		 switch(choice) {
    		     case 1:{
 			    System.out.println("Enter The Quantity!");
 			       f.getQuntity(sc.nextInt(), 1);
 			      
 			       break;
 		        }
    		     case 2:{
    		    	 System.out.println("Enter The Quantity!");
    		    	    f.getQuntity(sc.nextInt(), 2);
    		    	    
    		    	    break;
    		    	    
    		     }
    		     case 3:{
    		    	 System.out.println("Enter The Quantity!");
 		    	     f.getQuntity(sc.nextInt(), 3);
 		   
 		    	     break;
    		     }
    		     case 4:{
    		    	 System.out.println("Enter The Quantity!");
 		    	     f.getQuntity(sc.nextInt(), 4);
 		   
 		    	     break;
    		     }
    		     case 5:{
    		    	 System.out.println("Enter The Quantity!");
 		    	     f.getQuntity(sc.nextInt(), 5);
 		   
 		    	     break;
    		     }
    		     case 6:{
    		    	 System.out.println("Enter The Quantity!");
 		    	     f.getQuntity(sc.nextInt(), 6);
 		   
 		    	     break;
    		     }
    		     case 7:{
    		    	 System.out.println("Enter The Quantity!");
 		    	     f.getQuntity(sc.nextInt(), 7);
 		   
 		    	     break;
    		     }
    		     case 8:{
    		    	 System.out.println("Enter The Quantity!");
 		    	     f.getQuntity(sc.nextInt(), 8);
 		   
 		    	     break;
    		     }
    		     case 9:{
    		    	 System.out.println("Enter The Quantity!");
 		    	     f.getQuntity(sc.nextInt(), 9);
 		   
 		    	     break;
    		     }
    		     case 10:{
    		    	 System.out.println("Enter The Quantity!");
 		    	     f.getQuntity(sc.nextInt(), 10);
 		   
 		    	     break;
    		     }
    		     case 11:{
    		    	 
 		    	     f.generateBill();
 		   
 		    	     break;
    		     }
    		     
    		     default : break;
    		 }
    		 
    	 }	       
    		
      }
   }
}
