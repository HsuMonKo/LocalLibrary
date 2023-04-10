package toppan.fullstack.locallibrary.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import toppan.fullstack.locallibrary.DTO.BookDTO;
import toppan.fullstack.locallibrary.customException.InvalidParameterException;
import toppan.fullstack.locallibrary.customException.NoResultsException;
import toppan.fullstack.locallibrary.model.Author;
import toppan.fullstack.locallibrary.model.Book;
import toppan.fullstack.locallibrary.model.Country;
import toppan.fullstack.locallibrary.model.Person;
import toppan.fullstack.locallibrary.repository.BookRepository;
import toppan.fullstack.locallibrary.service.BookRentService;
import toppan.fullstack.locallibrary.service.CountryService;
import toppan.fullstack.locallibrary.service.PersonService;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("/")
public class LocalLibraryController {
	
	@Autowired
	CountryService countryService;
	
	@Autowired
	BookRentService bookRentService;
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/getRandomCountry")
	public Country getRandomCountry() {
		List<Country> countries = countryService.getAllCountries();
		Random random = new Random();
		return countries.get(random.nextInt(countries.size()));
	}
	
	@GetMapping("/getTop3ReadBooks")
	public ResponseEntity<?> getTop3ReadBooks(@RequestParam("country_code") String countryCode) {
		try {
			if(countryCode==null || countryCode.isEmpty()) {
				throw new InvalidParameterException("invalid parameter");
			}
			
			List<BookDTO> bookDtoList = new ArrayList<BookDTO>();
			List<Book> topRentedBooks = bookRentService.getTop3RentedBooksGlobally();
			if(topRentedBooks.isEmpty()) {
				throw new NoResultsException("no results");
			}
			
			for(Book book : topRentedBooks) {
				BookDTO bookDto = new BookDTO();
				List<Person> topBorrowers = personService.getTop3PersonByCountryCode(book, countryCode);
				String authors = book.getAuthors().stream().map(Author::getName).collect(Collectors.joining(", "));
				bookDto.setAuthor(authors);
				bookDto.setName(book.getName());
				bookDto.setBorrower(topBorrowers);
				bookDtoList.add(bookDto);
			}
			
			return ResponseEntity.ok(bookDtoList);		
		
	} catch(InvalidParameterException ex) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", ex.getMessage()));
	} catch(NoResultsException ex) {
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(Map.of("message", ex.getMessage()));
	} catch(Exception ex) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("message", ex.getMessage()));
	}
	
}

}
