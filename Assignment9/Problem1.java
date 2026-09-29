package com.sunbeam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

enum Menu{  
	EXIT,ADD,DISPLAY,SEARCH,SORT
}
class Student{
	
	private int id;
	private String name;
	private double marks;
	
	Student(){
		
	}
	
	Student(int id,String name,double marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Marks=" + marks + "]";
	}
	
	public void  acceptRecord() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Id");
		this.id=sc.nextInt();
		System.out.println("Enter The Name");
		this.name=sc.next();
		System.out.println("Enter The Marks");
		this.marks=sc.nextDouble();
		
	}
	
	
}

class Helper {
	
	
	public static void add(List<Student> list,Student std) {
		  list.add(std);
		  System.out.println("Student Added SuccessFully!");
	}
	
	public static void Display(List<Student> list) {
		    Iterator<Student> it = list.iterator();
		    
		    while(it.hasNext()) {
		    	System.out.println(it.next());
		    }
		    
	}
	
	public static void Search(List<Student> list,Scanner sc) {
	
		System.out.println("Enter the Roll No");
		int id= sc.nextInt();
		
		for(Student student : list) {
			if(student.getId()==id) {
				System.out.println(student);
				return;
			}
		}
		
		System.out.println("Student Not Found With This Id  " +id);
	}
	
	
	public static int menuList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.Sort By Roll No");
		System.out.println("2.Sort By Name");
		System.out.println("3.Sort By Marks");
		System.out.println("Enter The Choice");
		return sc.nextInt();
	}
	
	public static void sort(List<Student> list) {
		 int choice;
		while((choice=menuList())!=0) {
			switch(choice) {
			case 0 :break;
			case 1: Collections.sort(list,(x,y)->x.getId()-y.getId());
			        break;
			case 2: list.sort((x,y)->x.getName().compareTo(y.getName()));
			        break;
			case 3: list.sort((x,y)->Double.compare(x.getMarks(), y.getMarks()));
			
			}
		}
		
		
	}
	
	public static Menu Menus(Menu[] arr) {
		Scanner sc= new Scanner(System.in);
		 for(Menu m : arr) {
			  System.out.println(m.ordinal()+"   "+m.name());
		  }
		 System.out.println("Enter The Choice");
		 
		 return arr[sc.nextInt()];
		 
	}
}





public class Problem1 {
	
	
	
   public static void main(String[] args) {
	   
	  List<Student> list  = new ArrayList<>();
	  list.add(new Student(4, "Rahul", 85));
	  list.add(new Student(3, "Amit", 78));
	  list.add(new Student(1, "Sneha", 92));
	  list.add(new Student(2, "Priya", 88));
	  list.add(new Student(5, "Vijay", 74));
	  
	  Student student = new Student();
      Scanner sc = new Scanner(System.in);
	  Menu[] menus =Menu.values();  
	     
	  Menu choice;
	  try {
			 while((choice = Helper.Menus(menus))!=Menu.EXIT) {
			    	
	      	    
	        	 switch(choice) {
	        	   case EXIT : 
	        		          break;
	        	   case ADD : student.acceptRecord();
	        	              Helper.add(list, student);
	        		           break;
	        		          
	        	   case DISPLAY:Helper.Display(list);
	        		            break;
	        		            
	        	   case SEARCH :Helper.Search(list,sc);
	        		            break;
	        	   case SORT:Helper.sort(list);
	        	            break;
	        	 }  	 
	      	    
	       }
	  }catch(Exception ex) {
	    	System.out.println(ex.getMessage());
	    }
   }
} 
