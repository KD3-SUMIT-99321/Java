package com.sunbeam;

import com.domain.Book;
import com.util.CompareByPriceDesc;

import java.util.Scanner;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Program {
	 public static List<Book> bookList = new ArrayList<>();
	 public static Scanner sc =new Scanner(System.in);
   public static Book[] getInstance() {
	   Book arr[]={
			    new Book("Java Programming", 599.50, "James Gosling", 10),
			    new Book("Clean Code", 450.00, "Robert C. Martin", 15),
			    new Book("Effective Java", 700.75, "Joshua Bloch", 8),
			    new Book("Head First Java", 550.25, "Kathy Sierra", 12),
			    new Book("Spring in Action", 650.00, "Craig Walls", 7)
	   };
	   return arr;
   }
   
   public static void addBook(Book arr[]){
	   for(int i=0;i<arr.length;i++) {
		   bookList.add(arr[i]);
	   }
	   System.out.println("All Books Added Successfully!");
   }
   
   public static void displayBooksInForwordOrder(List<Book> book) {
	   Iterator<Book> it = bookList.iterator();
	   while(it.hasNext()) {
		   Book b = it.next();
		   System.out.println(b.toString());
	   }
   }
   
   public static void deleteBookByIndex(String bn) {
	     Book key = new Book();
	          key.setBn(bn);
	         int index= bookList.indexOf(key);
	         if(bookList.contains(key)) {
	        	  bookList.remove(index);
	        	 System.out.println("Book Removed Successfully!");
	         }else {
	        	 System.out.println("Book Not Found!");
	         } 
   }
   
   public static void  displayBooksInBackwordOrder(List<Book> book){
	   ListIterator<Book> it = bookList.listIterator(bookList.size());
	   while(it.hasPrevious()) {
		  Book b= it.previous();
		  System.out.println(b.toString());
	   }
   }
   

	public static void printEmployee(Book b) {
		if(b!=null) {
			System.out.println(b.toString());
		}else {
			System.out.println("Book Not Found!");
		}
	}

	public static void acceptRecord(String[] bn) {
		 System.out.println("Enter the Book No");
		       sc.nextLine();
		 bn[0] =sc.nextLine();	 
	}

	public static Book findBook(String bn) {
	    Book key = new Book();
	    key.setBn(bn);
	 
	   int index = bookList.indexOf(key);
	    	if(index!=-1) {
	    		Book b1 = bookList.get(index);
	    		  return b1;
	    	}
	    return null;
	    
	}
	
	public static int menuList2() {
		 System.out.println("0.Exit");
		 System.out.println("1.Book No");
		 System.out.println("2.Price ");
		 System.out.println("3.Quantity ");
		 System.out.println("Enter The Choice");
		 return sc.nextInt();
	}


	public static void updateBook(String bn) {
		  Book key = new Book();
		       key.setBn(bn);
		     int idx=  bookList.indexOf(key);
		  if(idx!=-1) {
			  Book b = bookList.get(idx);
			  System.out.println(b.toString());
			  System.out.println("Enter Which Part Do You Want To Update");
			  int choice = menuList2();
			  
			  switch(choice) {
			    case 1:  System.out.println("Enter The New Book No");
			             String s =sc.nextLine();
			             b.setBn(bn);
			             System.out.println("Book No Update Succesfully!");
			             break;
			    case 2 : System.out.println("Enter The New Book Price");
	                     double price =sc.nextDouble();
	                     b.setPrice(price);
	                     System.out.println("Book Price Update Succesfully!");
	                     break;
			    case 3:  System.out.println("Enter The Book Quantity");
	             	     int quantity  =sc.nextInt();
	             	     b.setQuantity(quantity);
	             	     System.out.println("Book Quantity Modified  Succesfully!");
	             	     break;
	            default : System.out.println("Invalid Choice");
	            
	            case 0: break;
	            
			  }
			  System.out.println("Modified Book");
			  System.out.println();
			  System.out.println(b.toString());
		  }
	}
	
	public static int menuList() {
		System.out.println("0.Exit");
		
		System.out.println("1.Add Book");
		System.out.println("2.Display In Forward Order");
		System.out.println("3.Display In Backward Order");
		System.out.println("4.Accept Record");
		System.out.println("5.Find Book");
		System.out.println("6.Sort All Book");
		System.out.println("7.Update Book ");
		System.out.println("8.Delete Book ");
		
		System.out.println("Enter The choice");
		return sc.nextInt();
	}
		
   public static void main(String[]args) {
	     int choice;
	     String bn[] = new String[1];
	   
	     while((choice=Program.menuList())!=0) {
	    	 
	    	 switch(choice) {
	    	   case 1: Book[] arr=Program.getInstance();
	    	           Program.addBook(arr);
	    		       break;      
	    	   case 2:Program.displayBooksInForwordOrder(bookList);
	    		       break;
	    	   case 8:Program.acceptRecord(bn);
	    		      Program.deleteBookByIndex(bn[0]);
	    		      break;
	    	   case 3:Program.displayBooksInBackwordOrder(bookList); 
	    		      break;
	    	   case 4: Program.acceptRecord(bn);
	    	          break;
	    	   case 5:Program.acceptRecord(bn);
	    		      Book book =Program.findBook(bn[0]);
	    	          Program.printEmployee(book);
	    	          break;
	    	   
	    	   case 7:Program.acceptRecord(bn);
	    		      Program.updateBook(bn[0]);
	    		      break;
	    		      
	    	   default : break;
	    		      
	    	   case 6: 
	    		   bookList.sort(new CompareByPriceDesc());
	    		   System.out.println("Sorted By Price!");
	    		   Program.displayBooksInForwordOrder(bookList);
	    	 }
	     }
   }
}
