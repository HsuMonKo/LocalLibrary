package toppan.fullstack.locallibrary.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import toppan.fullstack.locallibrary.model.Book;
import toppan.fullstack.locallibrary.model.Person;
import toppan.fullstack.locallibrary.repository.PersonRepository;
import toppan.fullstack.locallibrary.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonRepository pr;

	@Override
	public List<Person> getTop3PersonByCountryCode(Book b, String countryCode) {
		// TODO Auto-generated method stub
		return pr.findTop3PersonByCountryCode(b, countryCode);
	}

}
