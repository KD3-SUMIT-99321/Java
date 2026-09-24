package com.domain;


//
//1. Store book details in a library in a list -- ArrayList.
//Book details: isbn(string), price(double), authorName(string), quantity(int)
//Write a menu driven program to
//1. Add new book in list
//2. Display all books in forward order
//3. Display all books in reverse order
//4. Delete a book at given index.
//5. Sort all books by price in desc order -- list.sort();
public class Book implements Comparable<Book>{
     private String bn;
     double price;
     String authorName;
     int quantity;
     
     public Book() {}
     
	 public String getBn() {
		 return bn;
	 }
	 public void setBn(String bn) {
		 this.bn = bn;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public void setPrice(double price) {
		 this.price = price;
	 }
	 public String getAuthorName() {
		 return authorName;
	 }
	 public void setAuthorName(String authorName) {
		 this.authorName = authorName;
	 }
	 public int getQuantity() {
		 return quantity;
	 }
	 public void setQuantity(int quantity) {
		 this.quantity = quantity;
	 }
	 public Book(String bn, double price, String authorName, int quantity) {
		this.bn = bn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	 }

	 @Override
	 public String toString() {
		return "Book [bn=" + bn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity + "]";
	 }
	 
	 
	 @Override
	 public boolean equals(Object x) {
		 if(x==null) {
			 return false;	 
		 }
		 if(x==this) {
			 return true;
		 }
		 
		 Book b = (Book) x; 
		 if(b.bn.equals(this.bn)) {
			 return true;
		 }
		 
		 return false;
	 }
     
	 @Override
	 public int compareTo(Book obj) {
		 Book b = (Book)obj;
		 return Double.compare(this.getPrice(),obj.getPrice());
	 }
     
}
