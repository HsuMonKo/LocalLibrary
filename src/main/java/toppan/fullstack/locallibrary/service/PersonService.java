package toppan.fullstack.locallibrary.service;

import java.util.List;

import toppan.fullstack.locallibrary.model.Book;
import toppan.fullstack.locallibrary.model.Person;

public interface PersonService {

	public List<Person> getTop3PersonByCountryCode(Book b, String countryCode);
	
}
