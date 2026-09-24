package com.util;

import java.util.Comparator;

import com.domain.Book;

public class CompareByPriceDesc implements Comparator<Book>{

	@Override
	public int compare(Book x, Book y) {
		return Double.compare(y.getPrice(), x.getPrice()) ;
	}
   

}
