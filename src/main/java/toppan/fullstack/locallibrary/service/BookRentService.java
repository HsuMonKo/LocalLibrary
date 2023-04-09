package toppan.fullstack.locallibrary.service;

import java.util.List;

import toppan.fullstack.locallibrary.model.Book;

public interface BookRentService {
	
	List<Book> getTop3RentedBooksGlobally();

}
