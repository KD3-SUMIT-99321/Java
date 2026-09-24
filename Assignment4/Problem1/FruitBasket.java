package com.app.fruits;

import java.util.Scanner;

abstract class Fruit {
	protected String color;
	protected double weight;
	protected String name;
	private boolean isFresh;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	Fruit(String color, double weight, String name) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}

	abstract public String taste();
}

class Apple extends Fruit {

	Apple(String color, double weight, String name) {
		super(color, weight, name);
	}

	public String taste() {
		return "sweet and sour";
	}

	@Override
	public String toString() {
		return String.format("Name : %s | Color : %s | Weight %.2f", super.name, super.color, super.weight);
	}

}

class Orange extends Fruit {
	Orange(String color, double weight, String name) {
		super(color, weight, name);

	}

	public String taste() {
		return "sour";
	}

	@Override
	public String toString() {
		return String.format("Name : %s | Color : %s | Weight %.2f", super.name, super.color, super.weight);
	}
}

class Mango extends Fruit {

	Mango(String color, double weight, String name) {
		super(color, weight, name);

	}

	@Override
	public String taste() {
		return "sweet";
	}

	@Override
	public String toString() {
		return String.format("Name : %s | Color : %s | Weight %.2f", super.name, super.color, super.weight);
	}
}

class Helper {
	private String name;
	private String color;
	private double weight;
	private Scanner sc ;
    
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public  void acceptRecord() {
		System.out.println("Enter Name");
		name = sc.nextLine();
		System.out.println("Enter Color");
		color = sc.nextLine();
		System.out.println("Enter Weight");
		weight = sc.nextDouble();
	}
	
	Helper(Scanner sc){
		this.sc=sc;
	}

	public  boolean boundryCheck(int count, int size) {
		if (count < size) {
			return true;
		}
		return false;
	}

	public  void displayFruitsName(Fruit basket[]) {

		for (Fruit f : basket) {
			if (f != null) {
				System.out.println(f.getName());
			}  

		}
	}

	public  void displayFruitsDetails(Fruit basket[]) {
		for (Fruit f : basket) {
			if(f!=null) {
				if (f instanceof Apple) {
					Apple apple = (Apple) f;
					System.out.println(apple);
					System.out.println(apple.taste());
					if (apple.isFresh()) {
						System.out.println("Quality  : Fresh");
					}else {
						System.out.println("Quality  : Stale");
					}
				} else if (f instanceof Orange) {
					Orange orange = (Orange) f;
					System.out.println(orange);
					System.out.println(orange.taste());
					if (orange.isFresh()) {
						System.out.println("Quality  : Fresh");
					}else {
						System.out.println("Quality  : Stale");
					}
				} else if (f instanceof Mango) {
					Mango mango = (Mango) f;
					System.out.println(mango);
					System.out.println("Taste : " +mango.taste());
					if (mango.isFresh()) {
						System.out.println("Quality  : Fresh");
					}else {
						System.out.println("Quality  : Stale");
					}
				} 
			}
		}
	}

	public  void displayTastesOfStaleFruits(Fruit[] basket) {
		for (Fruit f : basket) {
			
			if(f!=null) {
				if(!f.isFresh()) {
					System.out.println("Taste :" +f.taste());
				}
			}
			
		}
	}

	public  void markFruitAsStale(Fruit basket[]) {
		int index;
		System.out.println("Enter The Index Of Fruit (0/1/2/3...)");
		index = sc.nextInt();
		if (index>=0 &&index < basket.length && basket[index]!=null) {
			basket[index].setFresh(false);
			System.out.println("Marked It As Stale!");
		} else {
			System.out.println("Fruit is Not Exist!");
		}
	}

	public  void markAllSourFruitAsStale(Fruit basket[]) {
		for (Fruit f : basket) {
			
			if(f!=null && f.taste().toLowerCase().contains("sour")) {
				f.setFresh(false);
			}
			
			
		}
	}

}

public class FruitBasket {

	static Scanner sc = new Scanner(System.in);
   
	public static int menuList() {
		 int choice;
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display names of all fruits");
		System.out.println("5.Display All Fruits");
		System.out.println("6.Display Stale Fruits");
		System.out.println("7.Mark Fruit As Stale");
		System.out.println("8.Mark all sour fruits stale");

		System.out.println("Enter The Choice");
		   choice=sc.nextInt();
		 sc.nextLine();
;		return choice;
	}

	public static void main(String[] args) {

		System.out.println("Enter The Basket Size (4/5/6..)");
		int size = sc.nextInt();
		Fruit basket[] = new Fruit[size];
		int count = 0;
		Fruit fruit = null;
		
        Helper helper =new Helper(sc);
		int choice;

		while ((choice = menuList()) != 0) {
			
			
			switch (choice) {
			
			case 1: {
				helper.acceptRecord();
				fruit = new Mango(helper.getColor(), helper.getWeight(), helper.getName());
				if (helper.boundryCheck(count, size)) {
					basket[count] = fruit;
					count++;
					

				} else {

					System.out.println("Basket is Full");
				}
				break;
			}

			case 2: {

				helper.acceptRecord();
				fruit = new Orange(helper.getColor(), helper.getWeight(), helper.getName());
				if (helper.boundryCheck(count, size)) {
					basket[count] = fruit;
					count++;
					

				} else {

					System.out.println("Basket is Full");
				}
				break;
			}
			case 3: {
				helper.acceptRecord();
				fruit = new Apple(helper.getColor(), helper.getWeight(), helper.getName());
				if (helper.boundryCheck(count, size)) {
					basket[count] = fruit;
					count++;
					

				} else {

					System.out.println("Basket is Full");
				}
				break;
			}

			case 4: {
				helper.displayFruitsName(basket);
				break;
			}

			case 5: {
				helper.displayFruitsDetails(basket);
				break;
				
			}

			case 6: {
				helper.displayTastesOfStaleFruits(basket);
				break;
			}

			case 7: {
				helper.markFruitAsStale(basket);
				break;
			}
			case 8: {
				helper.markAllSourFruitAsStale(basket);
				break;
			}
			
			case 0:{
				    break;
			}
			
			}

			

		}

	}
}
