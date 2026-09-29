
import java.util.Scanner;
class Employee{
	private int id;
	private String name;
	private double salary;
	Scanner sc = new Scanner(System.in);
	
	Employee(){
		
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void accept(){
		System.out.println("Enter the Id");
		setId(sc.nextInt());
		System.out.println("Enter the Name");
		setName(sc.next());
		System.out.println("Enter the Salary");
		setSalary(sc.nextDouble());
	}
	

    
	//
	//
	//Q1) Create Java application for fixed stack & growable stack based on Stack
	//interface, for storing emp details.
	//1.1 Create Employee class -- id,name,salary, constructor,toString
	//1.2 Stack interface -- push & pop functionality for Emp refs. & declare
	//STACK_SIZE as a constant.
	//1.3 Create implementation class of Stack i/f -- FixedStack (array based)
	//1.4 Create another implementation class of Stack i/f-- GrowableStack (array
	//based)
	//1.5 Create Tester class (Hint : use dynamic method dispatch using
	//interfaces)
	//Display Menu
	//Note : Must use 1 switch-case only. You won't need any complex nested
	//control structure
	//Once user selects either fixed or growable stack , user shouldn't be allowed
	//to change the selection of the stack.
	//(Hint : null checking)
	
}
interface Stack{
	 void push(Employee emp);
	 Employee pop();
	 Employee peek();
	 int STACK_SIZE=10;
	 
	 
}
class FixedStack implements Stack{
	Employee stack[]=new Employee[Stack.STACK_SIZE];
     int index=-1;
	@Override
	
	public void push(Employee emp) {
		if(index<Stack.STACK_SIZE-1) {
			index++;
		 	stack[index]=emp;
		   	
		}else {
			System.out.println("Stack is Full");
		}
	  
	}

	@Override
	public Employee pop() {
		if(index<0) {
			System.out.println("Stack is Empty");
			return null;
		}else {
		 Employee emp =stack[index];
		  index--;
		  return emp;
		}
		
	}
	
	public Employee peek() {
		if(index==-1) {
			System.out.println("Stack is Empty");
			return null;
		}else {
			return stack[index];
		}
	 }
	
}

class GrowableStack implements Stack{
	
	Employee stack[]=new Employee[Stack.STACK_SIZE];
	int index=-1;
	
	
	@Override
	public void push(Employee emp) {
		if(index<Stack.STACK_SIZE-1) {
			index++;
		 	stack[index]=emp;
		   	
		}else {
	        Employee temp[]=stack;
	        
		    stack=new Employee[stack.length+10];
			
			for(int i=0;i<temp.length;i++) {
				stack[i]=temp[i];
			}
			
			index++;
			stack[index]=emp;
		

		}
		
		

	}

	@Override
	public Employee pop() {
		if(index<0) {
			System.out.println("Stack is Empty");
			return null;
		}else {
		 Employee emp =stack[index];
		  index--;
		  return emp;
		}
		
	}
	
	public Employee peek() {
		if(index==-1) {
			System.out.println("Stack is Empty");
			return null;
		}else {
			return stack[index];
		}
		
	}
	
	public void printStack() {
		for(int i=0;i<=index;i++) {
			System.out.println(stack[i]);
		}
	}
	
}
enum Stack2{
	
	EXIT,GROWABLE,FIXED,PUSH,POP,PEEK
}
class Test{
	public void test() { 
		
		Stack stack =null;
		
		Stack2 arr[]=Stack2.values();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) { 
			System.out.println(arr[i].ordinal()+" "+arr[i].name());
		}	
		Stack2 choice=null;
		do {

		    System.out.println("Enter The Choice");
		    choice = arr[sc.nextInt()];

		    switch (choice) {

		    case GROWABLE:
		        if (stack == null)
		            stack = new GrowableStack();
		        else
		            System.out.println("Stack already selected");
		        break;

		    case FIXED:
		        if (stack == null)
		            stack = new FixedStack();
		        else
		            System.out.println("Stack already selected");
		        break;

		    case PUSH:
		        Employee emp = new Employee();

		        if (stack != null) {
		            emp.accept();
		            stack.push(emp);

		        } else {
		            System.out.println("Create a Stack");
		        }
		        break;

		    case POP:
		        if (stack != null) {
		            System.out.println(stack.pop());
		        } else {
		            System.out.println("Create a Stack");
		        }
		        break;

		    case PEEK:
		        if (stack != null) {
		            System.out.println(stack.peek());
		        } else {
		            System.out.println("Create a Stack");
		        }
		    case EXIT:break;
		    }

		} while (choice!=null);
	}
}

public class Problem1 {
    public static void main(String[] args) {
    	
    	Test t = new Test();
    	t.test();
    	
      
         
        
    }
       
}
